import java.util.*;
public class Program_175
{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number : ");
       int num =sc.nextInt();

       for(int i=1;i<=num;i++)
       {
          for(int j=1;j<=i;j++)
          {
             System.out.print(j+" ");
          }
          
          for(int j=i-1;j>=1;j--)
          {
             System.out.print(j+" ");
          }
         System.out.println();
       }
   }
}