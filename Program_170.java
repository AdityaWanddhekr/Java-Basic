import java.util.*;
public class Program_170
{

      // Inverted half Pyramid of number.
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();

      for(int i=num;i>=1;i--)
      {
         for(int j=1;j<=i;j++)
         {
           System.out.print(j+" ");
         }
        System.out.println();
      }
      
   }
}