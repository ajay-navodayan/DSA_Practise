public class binary_search {
      
    public static int bc(int numbers[ ],int key){
        int start=0; int end=numbers.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }return -1;

    }

    
    public static void main(String args[]){
        int numbers[]={1,3,34,45,54,61,64,76,78,98};
        int key=45;

        System.out.print("index for key is : "+bc(numbers,key));

    }
    
}
