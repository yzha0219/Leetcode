package No_7;


public class Solution1 {

    public static void main(String[] args) {
        int x = -123;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        String xs = String.valueOf(x);
        char[] xsa = xs.toCharArray();
        int length = xsa.length;
        char[] rc = new char[length];
        for(char c : xsa){
            if(c == '-'){
                rc[0] = xsa[0];
            }else {
                rc[length - 1] = c;
                length -= 1;
            }
        }
        String rcs = new String(rc);
        int rNum = 0;
        try{
            rNum = Integer.parseInt(rcs);
            return rNum;
        }catch (Exception e) {
            return rNum;
        }
    }
}
