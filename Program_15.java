import java.util.*;
public class Program_15{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();
      int lastDigit=num%10;
      System.out.println("The last Digit is : "+lastDigit);
    }
}