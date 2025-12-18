import java.util.*;

public class nextgreaterele {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[] res = new int[l1];

        for (int i = 0; i < l1; i++) {
            int idx = -1;

            for (int j = 0; j < l2; j++) {
                if (nums1[i] == nums2[j]) {
                    idx = j;
                    break;
                }
            }

            res[i] = -1;
            for (int k = idx + 1; k < l2; k++) {
                if (nums2[k] > nums1[i]) {
                    res[i] = nums2[k];
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        nextgreaterele obj = new nextgreaterele();
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] ans = obj.nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }
}
