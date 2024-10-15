import java.util.*;
public class Section_1_2{
   public static void main(String[] args){
     
       Scanner sc=new Scanner(System.in);    // Scanner class to take input from user
   
       System.out.println("Enter the number : ");
       int n=sc.nextInt();                  
   
       for(int i=1;i<=n;i++)                 // outer loop of row
       {
           for(int j=n;j>=i;j--)            // inner loop of spaces
          {
             System.out.print("  ");        // space print
          }
          for(int j=i;j>=1;j--)       // loop for print numbers
          {
             System.out.print(j+" ");
          }
          for(int j=i;j>=2;j--)        // loop to print right opposite numbers
          {
             System.out.print(j+" ");     // to print right opposite numbers
          }
         System.out.println();           // next line printing statement
       }
     
   }
}