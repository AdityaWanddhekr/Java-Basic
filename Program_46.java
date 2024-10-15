import java.util.*;
public class Program_46{
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the 3 digit number : ");
     int num=sc.nextInt(); 
     int rev=0;
     while(num>0){
         int lastDigit=num%10;
         rev=rev*10+lastDigit;
         num/=10;
     } 
     System.out.println(rev);
   }
}