import java.util.*;
public class Program_194
{
    public static void main(String[] args)
    {
       for(int i=1;i<=5;i++)
       {
          for(int j=1;j<=5;j++)
          {
             if(i==1 || j==1 || j==i )
             {
                System.out.print("*");
             }
             else
             {
                System.out.print(" ");
             }
          }
          for(int j=5;j>=1;j--)
          {
             if(i==1 ||  j==i || j==1)
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


       for(int i=4;i>=1;i--)
       {
          for(int j=1;j<=5;j++)
          {
             if(i==1 || j==1 || j==i )
             {
                System.out.print("*");
             }
             else
             {
                System.out.print(" ");
             }
          }
          for(int j=5;j>=1;j--)
          {
             if(i==1 ||  j==i || j==1)
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