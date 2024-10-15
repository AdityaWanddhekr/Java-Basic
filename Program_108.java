import java.util.*;
public class Program_108{

//Check weather the number is prime or not.

   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();
      
      boolean isPrime=true;
      int i=2;
      while(i<num){
        if(num%i==0){
           isPrime=false;
           break;
         }
       i++;
      }
      if(isPrime){
        System.out.println("The number is Prime!...");
      }
      else{
        System.out.println("The number is not Prime!...");
      }
   }
}