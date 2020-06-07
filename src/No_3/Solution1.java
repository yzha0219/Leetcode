package No_3;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {

    public static void main(String[] args) {

    }

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        int length = s.length();
        int right = 0;
        int result = 0;
        for(int i = 0;i < length;i++){
            if(i != 0){
                set.remove(s.charAt(i - 1));
            }

            while(right < length && !set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
            }
            result = Math.max(result,right - i);
        }
        return result;
    }
}
