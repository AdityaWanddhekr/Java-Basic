import java.util.*;
public class Test_2                       // class.
{
   public static void main(String[] args) // main method
   {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(" ");    // to print the spaces from the left side.
            }
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print(i);      // to print the numbers.
            } 
         System.out.println();            // for next line after completing the first line.
 
        }
   }
}