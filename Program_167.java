import java.util.*;
public class Program_167
{

      // Hollow Rectangle.
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();

      for(int i=1;i<=num;i++)
      {
          for(int j=5;j>=i;j--)
          {
            System.out.print("* ");
          }
        System.out.println();
      }
   }
}