import java.util.*;
public class Program_204
{
   public static void main(String[] args)
   {
        for(int i=65;i<=70;i++)
        {
           for(int j=65;j<=i;j++)
           {
               System.out.print((char)j);
           }
           for(int j=i-1;j>=65;j--)
           {
               System.out.print((char)j);
           }
          System.out.println();
        }
   }
}