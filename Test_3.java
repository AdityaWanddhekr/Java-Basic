import java.util.*;
public class Test_3                                  // class.
{
   public static void main(String[] args)            // main method.
   {
        for(int i=5;i>=1;i--)
        {
            for(int j=5;j>=i;j--)
            {
               System.out.print(" ");                // for the space printing.
            }
            for(int j=i;j>=1;j--)
            {
               if(j==1 || j==3 || j==5)  // condition for the odd printing *.
               {
                   System.out.print("*");
               }
               else
               {
                   System.out.print("#");           // else print #.
               }
            }
          System.out.println();                     //  for the printing at next line after every j prining.
 
        }
   }
}