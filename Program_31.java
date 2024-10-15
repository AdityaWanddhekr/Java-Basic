import java.util.*;
public class Program_31{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number 1 : ");
     int num1=sc.nextInt();
     System.out.println("Enter the number 2 : ");
     int num2=sc.nextInt();

     System.out.println("The numbers before swapping :\n num1 = "+num1+"\n num2 ="+num2);
     num1=num1+num2;
     num2=num1-num2;
     num1=num1-num2;
     System.out.println("The numbers before swapping :\n num1 = "+num1+"\n num2 ="+num2);
   }
}