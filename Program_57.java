import java.util.*;
public class Program_57{
      /*Chef has to travel to another place. For this, he can avail any one of two cab services.
      •	The first cab service charges XX rupees.
      •	The second cab service charges YY rupees.
      Chef wants to spend the minimum amount of money. Which cab service should Chef take?*/

   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cab 1 charges : ");
        int cab1=sc.nextInt();
        System.out.println("Enter the cab 2 charges : ");
        int cab2=sc.nextInt();
         System.out.println();
        if(cab1<cab2){
          System.out.println("FIRST");
        }
        if(cab1>cab2){
          System.out.println("SECOND ");
        }
        if(cab1==cab2){
          System.out.println("ANY");
        }
   }
}