package No_12;

public class Solution1 {

    public static void main(String[] args) {
        int num = 1994;
        System.out.println(intToRoman(num));
    }

    public static String intToRoman(int num) {

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0;i < values.length && num > 0;i++){
            if(values[i] <= num){
               num -= values[i];
               stringBuilder.append(symbols[i]);
            }
        }

        return stringBuilder.toString();
    }
}
