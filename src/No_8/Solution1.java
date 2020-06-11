package No_8;

public class Solution1 {

    public static void main(String[] args) {
<<<<<<< HEAD
        String s = "4193          ";
        System.out.println(Integer.parseInt(s));
    }

    public static int myAtoi(String str) {
        String trim = str.trim();
        char[] cArray = new char[trim.length()];
        for(int i = 0;i < trim.length();i++) cArray[i] = ' ';
        if(Character.isDigit(trim.charAt(0))){
            int i = 0;
            for (char c : trim.toCharArray()){
                if(!Character.isDigit(c)){
                    return convertInt(new String(cArray).trim());
                }else {
                    cArray[i] = c;
                    i++;
                }
            }
            return convertInt(new String(cArray).trim());
        } else if(trim.charAt(0) == '-' && Character.isDigit(trim.charAt(1))){
            cArray[0] = '-';
            for(int j = 1;j < trim.length();j++){
                if(!Character.isDigit(trim.charAt(j))){
                    return convertInt(new String(cArray).trim());
                }else {
                    cArray[j] = trim.charAt(j);
                }
            }
            return convertInt(new String(cArray).trim());
        } else{
            return 0;
        }
    }

    public static int convertInt(String s){
        if(s.charAt(0) != '-'){
            try {
                return Integer.parseInt(s);
            }catch (Exception e){
                return Integer.MAX_VALUE;
            }
        }else {
            try {
                return Integer.parseInt(s);
            }catch (Exception e){
                return Integer.MIN_VALUE;
            }
        }
=======

    }

    public boolean isPalindrome(int x) {
        String sx = String.valueOf(x);
        int length = sx.length();
        for(int i = 0;i < sx.length() / 2 ;i++){
            if(sx.charAt(i) != sx.charAt(length - 1)) return false;
            length--;
        }
        return true;
>>>>>>> 50fffec666abbf682e0b33627a43da21d70c0a67
    }
}
