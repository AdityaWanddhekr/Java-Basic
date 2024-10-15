import java.util.*;
public class Program_174
{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number : ");
       int num=sc.nextInt();
 
       for(int i=1;i<=num;i++)
       {
          for(int j=i;j<=num;j++){
            if(i==1||j==num||j==i||i==num)
            {
               System.out.print(j+" ");
            }
            else
            {
               System.out.print("  ");
            }
          }
         System.out.println();
       }
   }
}