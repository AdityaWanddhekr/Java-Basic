import java.util.*;
public class Program_45{
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the 3 digit number : ");
     int num=sc.nextInt(); 
     int rev=(num%10)*100+(num/10)%10*10+num/100;
     System.out.println("The rev is : "+rev);
     String Type=(num==rev)?"Palindrome":"Not Palindrome";
     System.out.println(Type);
   }
}
