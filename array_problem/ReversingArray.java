package complexity.array_problem;

public class ReversingArray {

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,13,3};
        printArrayD(reverseArray(nums));
    }

    private static void printArrayD(int[] nums) {
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    private static int[] reverseArray(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;

            start++;
            end--;
        }

        return nums;
    }

}
