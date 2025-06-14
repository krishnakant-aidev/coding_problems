package complexity.array_problem;

public class FindArrayElement {


    public static void main(String[] agrs){
        int[] nums = {2,4,5,6,5,2};
        int element = 10;

        System.out.println(" "+findElement(nums,element));
    }


    private static boolean findElement(int[] nums, int element) {
        for (int i = 0; i < nums.length; i++) {
            if (element == nums[i]) {
                return true; // Element found
            }
        }
        return false; // Element not found
    }

    //Overall complexity
    //T.C. -> O(n)
    //S.C. -> O(1)

    //Second solution B-search, will be added soon
}
