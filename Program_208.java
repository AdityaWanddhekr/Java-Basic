import java.util.*;
public class Program_208
{
   // # and *.
   public static void main(String[] args)
   {
      for(int i=5;i>=1;i--)
      {
         for(int j=5;j>=i;j--)
         {
            System.out.print(" ");
         }
         for(int j=i;j>=1;j--)
         {
           if(j%2==0){
             System.out.print("#");
           }
           else{
             System.out.print("*");
           }
         }
        System.out.println();
      }
   }
}