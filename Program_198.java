import java.util.*;
public class Program_198
{
    public static void main(String[] args)
    {  
          int k=1;
         for(int i=1;i<=5;i++)
         {
            for(int j=5;j>=i;j--)  
            {
               System.out.print(" ");
            }
            for(int j=1;j<i;j++)  
            {
               System.out.print(k+" ");
               k++;
            }
           
           System.out.println();
         }
    }
}