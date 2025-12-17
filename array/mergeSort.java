public class mergeSort {
    
    public static void mergeSort(int[] arr, int si, int ei) {
        if (si >= ei) return; // Base case: one element is already sorted

        int mid = si + (ei - si) / 2;

        // 1️⃣ Recursively divide the array
        mergeSort(arr, si, mid);      // Left part
        mergeSort(arr, mid + 1, ei);  // Right part

        // 2️⃣ Merge the sorted halves
        merge(arr, si, mid, ei);
    }

    public static void merge(int[] arr, int si, int mid, int ei) {
        // 3️⃣ Create a temp array to store merged result
        int[] temp = new int[ei - si + 1];
        int i = si;      // Pointer for left half
        int j = mid + 1; // Pointer for right half
        int k = 0;       // Pointer for temp array

        // 4️⃣ Merge both halves into temp[]
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];  // Take from left half
            } else {
                temp[k++] = arr[j++];  // Take from right half
            }
        }

        // 5️⃣ Copy remaining elements from left half (if any)
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // 6️⃣ Copy remaining elements from right half (if any)
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // ✅ 7️⃣ Now copy temp[] back to arr[si...ei]
        for (int p = 0; p < temp.length; p++) {
            arr[si + p] = temp[p];  // Not arr[p]! Because we’re copying to original positions
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 2};

        mergeSort(arr, 0, arr.length - 1);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
