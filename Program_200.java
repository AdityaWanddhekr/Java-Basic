import java.util.*;
public class Program_200
{
   public static void main(String[] args)
   {
       int x=8;
       for(int i=1;i<=5;i++)
       {
          for(int j=1;j<=i;j++)
          {
             System.out.print(j);
          }
          for(int j=1;j<=x;j++)
          {
             System.out.print(" ");
          }
          x-=2;
          for(int j=i;j>=1;j--)
          {
             System.out.print(j);
          }
         System.out.println();
       }
   }
}