package No_5;

public class Solution1 {

    public static void main(String[] args) {

    }

    public static String longestPalindrome(String s) {
        int length = s.length();
        if(length < 2){
            return s;
        }

        boolean[][] palind = new boolean[length][length];
        int maxLength = 1;
        int start = 0;

        for(int i = 0;i < length;i++){
            palind[i][i] = true;
        }

        for(int j = 1;j < length;j++){
            for(int i = 0;i < j;i++){
                if(s.charAt(i) == s.charAt(j)){
                    if(j - i < 3){
                        palind[i][j] = true;
                    }else {
                        palind[i][j] = palind[i + 1][j - 1];
                    }
                }else {
                    palind[i][j] = false;
                }

                if(palind[i][j] && j - i + 1 > maxLength){
                    maxLength = j - i + 1;
                    start = i;
                }
            }
        }

        return s.substring(start, start + maxLength);
    }
}
