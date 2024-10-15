import java.util.*;
public class Program_183
{
   public static void main(String[] args)
   {
          int x=3;
       for(int i=1;i<=4;i++)
       {
           for(int j=1;j<=i;j++)
           {
               System.out.print(x+" ");
               
           }
           x++;
          System.out.println();
       }
          x=x-2;
        for(int i=4-1;i>=1;i--)
       {
           for(int j=1;j<=i;j++)
           {
               System.out.print(x+" ");
               
           }
           x--;
          System.out.println();
       }
   }
}