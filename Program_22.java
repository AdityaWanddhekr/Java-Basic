import java.util.*;
public class Program_22{
// Write a program to find the maximum between two numbers.
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the num 1 : ");
     int num1=sc.nextInt();
     System.out.println("Enter the num 2 : ");
     int num2=sc.nextInt();

     String Maximum=(num1>num2)?"Num1 is maximum":"Num2 is maximum";
     System.out.println(Maximum);
   }
}