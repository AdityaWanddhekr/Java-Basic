import java.util.*;
public class Program_168
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
           System.out.print("* ");
        }
       System.out.println();
      }
      
   }
}