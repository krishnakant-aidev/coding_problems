package complexity.array_problem;

import java.util.HashMap;
import java.util.HashSet;

public class ElementFrequency {

    public static void main(String[] args){
        int[] nums = {1,2,3,4,1,2,3,7,3};
        HashMap<Integer, Integer> result = calculatedFreq(nums);

        System.out.println(result);
    }



    // This method is a brute-force approach to calculate the frequency of each element in an array.
    // It has worst-case performance and is mainly useful for interview discussions on time complexity.
    // Time Complexity: O(n^2) due to nested loops.
    // Space Complexity: O(n) for storing frequencies in the HashMap.

    private static HashMap<Integer, Integer> calculateElementFrequency(int[] nums) {

        // HashMap to store each element and its corresponding frequency
        HashMap<Integer, Integer> finalHashMap = new HashMap<>();

        // Outer loop to pick each element one by one
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            int frequency = 0;

            // Inner loop to count how many times the current element appears
            for (int j = 0; j < nums.length; j++) {
                if (element == nums[j]) {
                    frequency++;
                }
            }

            // Store the element and its frequency in the HashMap
            finalHashMap.put(element, frequency);
        }

        return finalHashMap;
    }


    // This is a better solution to calculate the frequency of each element in the array.
    // It uses a single-pass HashMap-based approach.
    // Time Complexity: O(n) — each element is processed once.
    // Space Complexity: O(n) — in the worst case, all elements are unique and stored in the HashMap.

    private static HashMap<Integer, Integer> calculatedFreq(int[] nums) {

        // HashMap to store each element and its frequency
        HashMap<Integer, Integer> frequencyHashMap = new HashMap<>();

        // Traverse the array once
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];

            // If the element is already in the map, increment its frequency
            if (frequencyHashMap.containsKey(element)) {
                frequencyHashMap.put(element, frequencyHashMap.get(element) + 1);
            }
            // If the element is not in the map, add it with frequency 1
            else {
                frequencyHashMap.put(element, 1);
            }
        }

        // Return the complete map of element-frequency pairs
        return frequencyHashMap;
    }


}
