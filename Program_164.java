import java.util.*;
public class Program_164
{

      // Soild Rectangle.
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();

      for(int i=1;i<=num;i++)
      {
          for(int j=1;j<=num;j++)
          {
             System.out.print("* ");
          }
        System.out.println();
      }
   }
}