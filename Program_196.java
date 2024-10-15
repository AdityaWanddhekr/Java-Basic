import java.util.*;
public class Program_196
{
   public static void main(String[] args)
   {
      for(int i=1;i<=5;i++)
      {
         for(int j=1;j<=i;j++)
         {
            if(i==5 || j==i || i==1)
            { 
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
         }
        System.out.println();
      }

       for(int i=5-1;i>=1;i--)
      {
         for(int j=1;j<=i;j++)
         {
            if(j==i || i==1)
            { 
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
         }
        System.out.println();
      }


/*------------------------------*/
      
      for(int i=1;i<=5;i++)
      {
         for(int j=5;j>=i;j--)
         {
            System.out.print(" ");
         }
         for(int j=1;j<=i;j++)
         {
            if(j==1 || i==5)
            { 
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
         }
        System.out.println();
      }

       for(int i=5-1;i>=1;i--)
      {
         for(int j=5;j>=i;j--)
         {
            System.out.print(" ");
         }
         for(int j=1;j<=i;j++)
         {
            if(j==1)
            { 
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
         }
        System.out.println();
      }
   }
}