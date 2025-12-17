public class reverse {

    public static void reverse1(int arr1[]){
        int first=0; int last =arr1.length-1;
        while(first<last){
            //Swap first and last
           int temp= arr1[last];
           arr1[last]=arr1[first];
           arr1[first]=temp;

           first++;
           last--;




        }


    }
    public static void main(String args[]){
        int arr1[]={4,7,1,8,2};
        reverse1(arr1);
        for(int i=0; i<arr1.length; i++){
             System.out.print(arr1[i]+" ");

        }
        // System.out.print(Arrays.toString(arr1)); //this also work
        

    }


    
}
