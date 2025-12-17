public class trapping_rw {
    public static int  rw(int arr1[]){
        
        //left max boundary auxilary array
        int left_max[]=new int[arr1.length];
        left_max[0]=arr1[0];
        for(int i=1; i<arr1.length; i++){
            left_max[i]=Math.max(arr1[i],left_max[i-1]);
        }

        //Right  max array
        
        int  Right_max[]=new int[arr1.length];
        Right_max[arr1.length-1]=arr1[arr1.length-1];
        for(int i=(arr1.length)-2; i>=0; i--){
            Right_max[i]=Math.max(arr1[i],Right_max[i+1]);
        }

        //Calculate  water trap
        int trapped_water=0;
        for(int i=0; i<arr1.length; i++){
            int water_level=Math.min(left_max[i],Right_max[i]);
            trapped_water+=water_level-arr1[i];

        }return trapped_water;
        


    }
    public static void main(String args[]){
        int  arr1[]={4,2,0,6,3,2,5};
        System.out.println(rw(arr1));



    }
    
}
