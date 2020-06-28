package No_11;

public class Solution1 {

    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left != right){
            int area = Math.min(height[left],height[right]) * (right - left);
            max = Math.max(max,area);
            if(height[left] > height[right]) right--;
            else left++;
        }

        return max;
    }
}
