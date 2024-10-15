import java.util.*;
public class Program_180
{
     public static void main(String[] args)
     {
          for(int i=1;i<=5;i++)
          {
             for(int j=10;j>i;j--)
             {
                System.out.print("*");
             }
            
               
             for(int j=i;j>=1;j--)
             {
               if(j<i)
                {
                   System.out.print("*");
                }
               
               System.out.print(i);
             }
            
             for(int j=10;j>i;j--)
             {
                System.out.print("*");
             }
            System.out.println();
          }
     }
}