import java.util.*;

public class a {
    public static void main(String args[]){
        int marks[]=new int[100];
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("math marks "+marks[0]);
        System.out.println("phy marks "+marks[1]);
        System.out.println("chem marks "+marks[2]);
        marks[1]=100;
        System.out.println("phy marks "+marks[1]);




    }
    
}
