import java.util.*;
public class Program_59{
   
/*Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction if X is a multiple of 5, and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges). For each successful withdrawal the bank charges 0.50 $US.
Calculate Pooja's account balance after an attempted transaction.*/

    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Pooja current Account is : ");
      double Balance=sc.nextDouble();
      System.out.println("Pooja want to withdraw is : ");
      double x=sc.nextDouble();
      System.out.println("Charges after every transaction is : ");
      double charge=sc.nextDouble();

      if(x%5==0 && (Balance>(x+charge))){
          Balance-=x+charge;
          System.out.println("After transaction Balance is "+Balance);
      } 
      else{
          System.out.println("can't perform transaction so balnce is :  "+Balance);
      }
    }
}
