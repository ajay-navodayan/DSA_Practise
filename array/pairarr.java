public class pairarr {

    public static void pairar(int arr1[]){
        int tp=0;  //pay attention to this1
        for(int i=0; i<arr1.length; i++){
            // int curr=arr1[i];
            
            for(int j=i+1; j<arr1.length; j++){
                System.out.print("("+arr1[i]+","+arr1[j]+")");
                tp++;
                
            }System.out.println();
        }System.out.println("total pair "+tp);
        
    }
    
    public static void main(String args[]){
        int arr1[]={3,8,9,2,7};
        pairar(arr1);



    }
}
