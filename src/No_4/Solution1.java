package No_4;

public class Solution1 {

    public static void main(String[] args) {

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums2.length == 0){
            return findMedianInOneArray(nums1);
        }else if(nums1.length == 0){
            return findMedianInOneArray(nums2);
        }
        int length = nums1.length + nums2.length;
        int capacity = length / 2 + 1;
        int[] merge = new int[capacity];
        int a1 = 0;
        int a2 = 0;
        for(int i = 0;i < capacity;i++){
            if (a1 > nums1.length - 1){
                merge[i] = nums2[a2];
                a2++;
            } else if (a2 > nums2.length - 1){
                merge[i] = nums1[a1];
                a1++;
            } else{
                if(nums1[a1] <= nums2[a2]){
                    merge[i] = nums1[a1];
                    a1++;
                }else {
                    merge[i] = nums2[a2];
                    a2++;
                }
            }
        }
        if(length % 2 == 0) {
            return ((double) merge[capacity - 1] + (double) merge[capacity - 2]) / 2.0;
        }else {
            return merge[capacity - 1];
        }
    }

    public static double findMedianInOneArray(int[] nums) {
        int middle = nums.length / 2;
        if (nums.length % 2 == 0) {
            double result = ((double) nums[middle - 1] + (double) nums[middle]) / 2.0;
            return result;
        }else {
            return nums[middle];
        }
    }
}
