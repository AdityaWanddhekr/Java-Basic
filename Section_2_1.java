import java.util.*;
public class Section_2_1{
   public static void subArraySum(int a[],int usum)
    { 
      
    }

   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size=sc.nextInt();
        
        int a[]=new int[size];
 
        System.out.println("Enter the element : ");
        for(int i=0;i<a.length;i++)
        {
           a[i]=sc.nextInt();
        }

        System.out.println("Enter the usum : ");
        int usum=sc.nextInt();

       subArraySum(a,usum);
   }
}