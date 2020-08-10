package No_13;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        int result = 0;
        char fChar = s.charAt(0);
        for (int i = 1;i < s.length();i++){
            char sChar = s.charAt(i);
            if(hashMap.get(fChar) >= hashMap.get(sChar)){
                result += hashMap.get(fChar);
            }else {
                result -= hashMap.get(fChar);
            }
            fChar = sChar;
        }
        result += hashMap.get(fChar);
        return result;
    }
}
