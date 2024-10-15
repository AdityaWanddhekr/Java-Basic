import java.util.*;
public class Program_76{
// WAP to find Profit or loss.
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Cost Price : ");
      int cost=sc.nextInt();
      System.out.println("Enter the selling Price : ");
      int sell=sc.nextInt();
 
      if(sell>cost){
        System.out.println("The Profit !...");
      }
    
     else{
        System.out.println("The Loss !...");
      }

  }	
}
