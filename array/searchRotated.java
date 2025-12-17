public class searchRotated {
    
    public static int search(int arr[], int tar, int si, int ei) {
        
        if (si > ei) return -1; // base case: element not found

        int mid = si + (ei - si) / 2;
        // Case FOUND
        if (arr[mid] == tar) {
            return mid;
        }

        // mid is on L1 (left sorted part)
        if (arr[si] <= arr[mid]) {
            // Case a: target in left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                // Case b: target in right
                return search(arr, tar, mid + 1, ei);
            }
        }

        // mid is on L2 (right sorted part)
        else {
            // Case c: target in right
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                // Case d: target in left
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 1, 2, 3, 4};  // Rotated sorted array
        int target = 2;

        int result = search(arr, target, 0, arr.length - 1);

        if (result != -1) {
            System.out.println("Target " + target + " found at index: " + result);
        } else {
            System.out.println("Target " + target + " not found.");
        }
    }
}
