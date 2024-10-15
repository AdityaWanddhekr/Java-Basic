import java.util.*;
public class Program_124{

//25. Write a C program to find LCM of two numbers.

   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number 1 : ");
     int num1=sc.nextInt();
     System.out.println("Enter the number 2 : ");
     int num2=sc.nextInt();
 
     int i=1;
     int gcd=0;    
     while(i<num1 && i<num2){
      if(num1%i==0 && num2%i==0){
         gcd=i;
      }
      i++;
     }
     int lcm=(num1*num2)/gcd;
     System.out.println("LCM IS : "+lcm);

   }
}