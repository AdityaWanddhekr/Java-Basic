import java.util.*;
public class Program_193
{
   public static void main(String[] args)
   {
        int x=8;
       for(int i=1;i<=5;i++)
       {
          for(int j=1;j<=i;j++)
          {
             System.out.print("*");
          }
          for(int j=1;j<=x;j++)
          {
             System.out.print(" ");
          }
          x-=2;
          for(int j=i;j>=1;j--)
          {
             System.out.print("*");
          }
         System.out.println();
       }

         x=1;
       for(int i=5;i>=1;i--)
       {
          for(int j=1;j<=i;j++)
          {
             System.out.print("*");
          }
          for(int j=1;j<x;j++)
          {
             System.out.print(" ");
          }
          x+=2;
          for(int j=i;j>=1;j--)
          {
             System.out.print("*");
          }
         System.out.println();
       }
   }
}