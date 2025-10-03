package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int [] nums = {2,7, 22, 59};
        int target = 9;
        int [] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + result[0]);

        }

        public static class TwoSum {
        public int [] twoSum(int [] nums, int target) {
            Map <Integer, Integer> numMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++){
                int complement = target - nums[i];
                if (numMap.containsKey(complement)){
                    return  new int [] {numMap.get(complement), i};
                }
                numMap.put(nums[i], i);
            }
            return new int[] {};
        }
    }

}
