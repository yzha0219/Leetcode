package No_9;

public class Solution1 {

    public static void main(String[] args) {

    }

    public boolean isPalindrome(int x) {
        String sx = String.valueOf(x);
        int length = sx.length();
        for(int i = 0;i < sx.length() / 2 ;i++){
            if(sx.charAt(i) != sx.charAt(length - 1)) return false;
            length--;
        }
        return true;
    }
}
