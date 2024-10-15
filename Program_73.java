import java.util.*;
public class Program_73{
  // Check weather the chacter isProfit or loss.
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Selling price :  ");
      int sell=sc.nextInt();
      System.out.println("Enter the cost price :  ");
      int cost=sc.nextInt();
      
      if(cost<sell){
         System.out.println("It's A profit ");
      }
      else{
         System.out.println("It's A loss ");
      }
    }
}