import java.util.*;
public class Program_86{

  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Unit :");
      double unit=sc.nextInt();
      double amount=0;
      double add_charge=0;
      double total_bill=0;

      if(unit<=50){
        amount=unit*0.50;
        add_charge=add_charge+(amount*0.2);
        total_bill=total_bill+(add_charge+amount);
        unit=unit-50;
      }

     else if(unit>50 && unit<=150){
        amount=unit*0.75;
        add_charge=add_charge+(amount*0.2);
        total_bill=total_bill+(add_charge+amount);
        unit=unit-150;
       
      }
     else if(unit>100 && unit<=250){
        amount=unit*1.20;
        add_charge=add_charge+(amount*0.2);
        total_bill=total_bill+(add_charge+amount);
         unit=unit-250;
      }
      else{
        amount=unit*1.50;
        add_charge=add_charge+(amount*0.2);
        total_bill=total_bill+(add_charge+amount);
       
      }
       System.out.println("Total bill = "+total_bill);

  }
}
