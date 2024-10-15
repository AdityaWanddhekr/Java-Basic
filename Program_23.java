import java.util.*;
public class Program_23{
// Write a program to find the maximum between three numbers.
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the num 1 : ");
       int num1=sc.nextInt();
       System.out.println("Enter the num 2 : ");
       int num2=sc.nextInt();
       System.out.println("Enter the num 3 : ");
       int num3=sc.nextInt(); 

       String Maximum=(num1>num2 && num1>num3)?"Num1 is maximum":(num2>num3)?"Num2 is greater":"Num3 is greater"; 
       System.out.println(Maximum);

   }
}