import java.util.*;
public class Section_2_2{
   public static void maxSubarray(int a[],int k)
    {
       for(int i=0;i<a.length;i++)
        {
            int max=Integer.MIN_VALUE;
            for(int j=i;j<k;j++)
            {
                if(a[j]>max)
                {
                    max=a[j];
                }
            } 
           System.out.print("max : "+max);
             k++;
            System.out.println();
            
        }
      
        
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

        System.out.println("Enter the velue of K : ");
        int k=sc.nextInt();

       maxSubarray(a,k);
   }
}