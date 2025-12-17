public class sub_array {
    

    public static void subarr(int arr1[]){
        int total_subarr=0;
        for(int i=0; i<arr1.length; i++){       //ye haii start wale ke liye
            for(int j=i; j<arr1.length; j++){  // ye haii end wale ke liye
            
                for(int k=i; k<=j; k++){                
                    System.out.print(arr1[k]+" ");                         
                    
                }System.out.println();               
                total_subarr++;

            }System.out.println();
        }System.out.print("total subarray is : "+total_subarr);  
        
    }
    
    public static void main(String args[]){
        int arr1[]={3,7,8,9};
        subarr(arr1);

    



    }
}
