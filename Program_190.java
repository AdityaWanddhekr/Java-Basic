import java.util.*;
public class Program_190
{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the num : ");
       int num=sc.nextInt();
   
       for(int i=1;i<=num*2;i++)
       {
           for(int j=1;j<=num;j++)
           {
              if(i==1|| j==1|| i==num*2 || i==((num*2)/2)+1)
              {
                  System.out.print("* ");
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