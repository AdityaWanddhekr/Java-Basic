import java.util.*;
public class Program_203
{
   public static void main(String[] args)
   {
       int x=1;
       for(int i=65;i<=70;i++)
       {
          
            for(int j=i;j>=65;j--)
            {
                System.out.print((char)j);
              
            }
            for(int j=65+1;j<=i;j++)
            {
                System.out.print((char)j);
              
            }
         System.out.println();
       }
   }
}