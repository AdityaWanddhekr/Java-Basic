import java.util.*;
public class Program_123{

//24. Write a C program to find HCF (GCD) of two numbers.

   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number 1 : ");
     int num1=sc.nextInt();
     System.out.println("Enter the number 2 : ");
     int num2=sc.nextInt();

     int i=2;
     while(i<num1 || i<num2){
       
        if(num1%i==0 && num2%i==0){
          System.out.println("GCD IS : "+i);
        }
       i++;
     }

   }
}