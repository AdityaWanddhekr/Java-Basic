import java.util.*;
public class Program_85{

  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the amount :");
      int amount=sc.nextInt();
      int no_nota=0;
     int res=0;
      if(amount>=1){
         no_nota=amount/500;
         res=500*no_nota;
         System.out.println("500 = "+no_nota);
         amount=amount-res;
        
         no_nota=amount/100;
         res=100*no_nota;
          System.out.println("100 = "+no_nota);
         amount=amount-res;

          no_nota=amount/50;
          res=50*no_nota;
         System.out.println("50 = "+no_nota);
         amount=amount-res;

          no_nota=amount/20;
          res=20*no_nota;
          System.out.println("20 = "+no_nota);
         amount=amount-res;

         no_nota=amount/10;
         res=10*no_nota;
        System.out.println("10 = "+no_nota);
         amount=amount-res;

         no_nota=amount/5;
          res=5*no_nota;
          System.out.println("5 = "+no_nota);
         amount=amount-res;

          no_nota=amount/2;
          res=2*no_nota;
          System.out.println("2 = "+no_nota);
          amount=amount-res;
      
          no_nota=amount/1;
          res=1*no_nota;
         System.out.println("1 = "+no_nota);
         amount=amount-res;

      }
     else{
      System.out.println("Invalid");
      }
    }
}
