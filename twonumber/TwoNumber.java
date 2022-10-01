package twonumber;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumber {
    public static void main(String[] args) {
        int[] e = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(e, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (map.containsKey(num)) {
                result[1] = i;
                result[0] = map.get(num);
                return result;
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
