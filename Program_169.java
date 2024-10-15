import java.util.*;
public class Program_169
{

      // Full Pyramid.
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();

      for(int i=1;i<=num;i++)
      {
        for(int j=num;j>=i;j--)
        {
           System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
          if(i==1||j==1||i==num || j==i)
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