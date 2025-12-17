public class prefix_arr_sum {

    //calculate maximum subarray sum

    public static void prefixsum(int arr1[]){
        int prefix[]=new int[arr1.length];
        prefix[0]=arr1[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i]=prefix[i-1]+arr1[i];

        }

        int curr_sum=0;
        int maximum=Integer.MIN_VALUE;
        for(int i=0; i<arr1.length; i++){       //ye haii start wale ke liye
            int start=i;
            for(int j=i; j<arr1.length; j++){  // ye haii end wale ke liye
                int end=j;
                curr_sum=start==0 ? prefix[end]:prefix[end]-prefix[start-1];
                if(maximum<curr_sum){
                    maximum=curr_sum;
                }
                 
                            
            

            }System.out.println();
        }System.out.println("this is maximum sum of this subarray :"+maximum) ;



    }

     //kedanes method
    
    public static void main(String args[]){
        int arr1[]={-2,-3,4,-1,-2,1,5,-3};
        prefixsum(arr1);
        kadanes(arr1);  


    }
    public static void kadanes(int arr1[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0; i<arr1.length; i++){
        cs=cs+arr1[i];
        if(cs<0){
            cs=0;

        }ms=Math.max(cs,ms);

        }System.out.print("our max subaray sum is :"+ms);

    }



    /*
     * public class ArraysCC {
    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;

                for (int k = start; k <= end; k++) {
                    // Subarray sum
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }
}

     */
    
}
