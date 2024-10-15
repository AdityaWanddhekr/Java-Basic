import java.util.*;
public class Program_13{
   // Calculate compound interst.
   public static void main(String[] args){ 
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Principal : ");
      int p=sc.nextInt();
      System.out.println("Enter the Rate : ");
      int r=sc.nextInt();
      System.out.println("Enter the Time : ");
      int t=sc.nextInt();

      double CI=(double)p*(Math.pow(1+r/100,t));
      System.out.println("The compound Interest is : "+CI);
      
   } 
}