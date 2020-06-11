package No_9;

public class Solution2 {

    public static void main(String[] args) {

    }

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int revertnumber = 0;
        while (x > revertnumber){
            revertnumber = revertnumber * 10 + x % 10;
            x /= 10;
        }

        return revertnumber == x || revertnumber / 10 == x;
    }
}
