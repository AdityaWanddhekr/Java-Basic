import java.util.*;
public class Program_199
{
   public static void main(String[] args)
   {
       int x=8;
       for(int i=1;i<=5;i++)
       {
          for(int j=1;j<=i;j++)
          {
             if(j%2!=0)
             {
                 System.out.print("0");
             }
             else
             {
                 System.out.print("1");
             }
          }
          for(int j=1;j<=x;j++)
          {
             System.out.print(" ");
          }
          x-=2;

          for(int j=i;j>=1;j--)
          {
             if((i+j)%2==0)
             {
                 System.out.print("0");
             }
             else
             {
                 System.out.print("1");
             }
          }
         System.out.println();
       }
   }
}