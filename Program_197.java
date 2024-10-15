import java.util.*;
public class Program_197
{
     // solid rombus and hollow rombus.
    public static void main(String[] args)
    {
       for(int i=1;i<=5;i++)
       {
          for(int j=5;j>=i;j--)
          {
             System.out.print("  ");
          }
          for(int j=1;j<=5;j++)
          {
             System.out.print("* ");
          }
         System.out.println();
       }

    


   
       for(int i=1;i<=5;i++)
       {
          for(int j=5;j>=i;j--)
          {
             System.out.print("  ");
          }
          for(int j=1;j<=5;j++)
          {
             if(i==1 || j==1 || i==5 || j==5)
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