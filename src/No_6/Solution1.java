package No_6;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    public static void main(String[] args) {

    }

    public static String convert(String s, int numRows) {
        if(numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for(int i = 0;i < Math.min(s.length(),numRows);i++)
            rows.add(new StringBuilder());

        int rowcurr = 0;
        boolean down = false;
        for(int i = 0;i < s.length();i++){
            rows.get(rowcurr).append(s.charAt(i));
            if(rowcurr == 0 || rowcurr == numRows - 1)
                down = !down;
            rowcurr += down ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for(StringBuilder sb: rows)
            result.append(sb);

        return result.toString();
    }
}
