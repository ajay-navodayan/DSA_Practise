import java.util.*;

public class countsbArray {

    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n = nums.length;
        int lastMin = -1, lastMax = -1, lastInvalid = -1;
        long count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] < minK || nums[i] > maxK) {
                lastInvalid = i;
            }
            if (nums[i] == minK) {
                lastMin = i;
            }
            if (nums[i] == maxK) {
                lastMax = i;
            }
            int minLast = Math.min(lastMin, lastMax);
            if (minLast > lastInvalid) {
                count += minLast - lastInvalid;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        countsbArray obj = new countsbArray();
        int[] nums = {1, 3, 5, 2, 7, 5};
        int minK = 1;
        int maxK = 5;
        System.out.println(obj.countSubarrays(nums, minK, maxK));
    }
}
