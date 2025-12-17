public class max_min {

    public static void subarrsum(int arr1[]){
        int maximum=Integer.MIN_VALUE;
        int minimum=Integer.MAX_VALUE;
        for(int i=0; i<arr1.length; i++){       //ye haii start wale ke liye
            for(int j=i; j<arr1.length; j++){  // ye haii end wale ke liye
                int cur_sum=0;
                for(int k=i; k<=j; k++){                
                    cur_sum=cur_sum+ arr1[k];                     
                    
                }System.out.println(cur_sum); 
                if(cur_sum>maximum){
                    maximum=cur_sum;
                }if(cur_sum<minimum){
                    minimum=cur_sum;
                }              
                
            }System.out.println();
        }System.out.println("max sum of subarr is :"+maximum);
        System.out.println("min sum of subarr is :"+minimum);
    }    
    public static void main(String args[]){
        int arr1[]={3,-7,8};
        subarrsum(arr1);  



    }
}


// public class MaxMin {

//     public static void subarrsum(int arr1[]) {
//         int maximum = Integer.MIN_VALUE;

//         // Outer loop for starting index of subarray
//         for(int i = 0; i < arr1.length; i++) {
//             // Middle loop for ending index of subarray
//             for(int j = i; j < arr1.length; j++) {
//                 // Variable declared here is within the scope of the middle loop
//                 int cur_sum = 0;

//                 // Inner loop to calculate sum of elements from index i to j
//                 for(int k = i; k <= j; k++) {
//                     cur_sum = cur_sum + arr1[k];  // Add current element to cur_sum
//                 }

//                 // cur_sum is printed here, inside the middle loop but outside the inner loop
//                 System.out.println("Sum of subarray from index " + i + " to " + j + " is: " + cur_sum);
//             }
//         }
//     }

//     public static void main(String args[]) {
//         int arr1[] = {3, 7, 8};
//         subarrsum(arr1);
//     }
// }


/*    Explanation of Scope and Variable Retention

Inner Loop (Third Loop):

The variable cur_sum is declared outside the inner loop but within the middle loop.
As the inner loop runs, it updates cur_sum by adding each element of the current subarray.
After Inner Loop (Still Within Middle Loop):

Once the inner loop completes its iteration, cur_sum holds the sum of the subarray from index i to j.
Since cur_sum was declared outside the inner loop, it retains its value after the inner loop completes.
Therefore, when you print cur_sum after the inner loop, it still contains the calculated sum for that subarray.
Middle Loop:

cur_sum is reset to 0 at the beginning of each iteration of the middle loop. This ensures that each subarray sum calculation starts fresh without any leftover value from the previous subarray.
Why cur_sum Retains Its Value for Printing
Variable Scope: cur_sum is within the scope of the middle loop. It gets reset at the start of each middle loop iteration but retains its value for the duration of the current iteration.
Sequence of Execution: The inner loop completes, updating cur_sum in each iteration. Once the inner loop is done, the value of cur_sum is printed before the middle loop moves to the next iteration.
 */

