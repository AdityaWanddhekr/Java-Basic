import java.util.*;
public class Section_1_1{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);    // Scanner class to take input from user
       

       System.out.println("Enter the number : ");
       int n=sc.nextInt();                
   
       for(int i=1;i<=n;i++)                 // outer loop of row
       {
           for(int j=n;j>=i;j--)            // inner loop of spaces
          {
             System.out.print(" ");        // space print
          }
          for(int j=1;j<=2*i-1;j++)       // loop for print *
          {
             System.out.print("*");
          }
         System.out.println();           // next line printing statement
       }
      for(int i=n-1;i>=1;i--)            // loop for outer for opposite side
       {
           for(int j=n;j>=i;j--)        // loop for space
          {
             System.out.print(" ");
          }
          for(int j=1;j<=2*i-1;j++)
          {
             System.out.print("*");
          }
         System.out.println();        // printting statement for next line.
       }
   }
}