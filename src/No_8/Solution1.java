package No_8;

public class Solution1 {

    public static void main(String[] args) {
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
    }
}
