import java.util.*;
public class Program_18{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number");
     int num=sc.nextInt();
     int sum=0;
     int lastDigit=num%10;
     sum+=lastDigit;
     num/=10;

     lastDigit=num%10;
     sum+=lastDigit;
     num/=10;

     lastDigit=num%10;
     sum+=lastDigit;
     num/=10;

     lastDigit=num%10;
     sum+=lastDigit;
     num/=10;

     System.out.println("The sum of the digit is : "+sum);
     
     
   }
}