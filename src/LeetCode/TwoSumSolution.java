package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {
    public static void main(String[] args) {

        Map<Integer, Integer> Keymap = new HashMap<>();

        for (int = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if (keymap.containsKeyt (complement)){
                reurn new int[]{keymap.get(complement), i}
            }

            keymap.put(nums[i], i)
        }

    }

}
