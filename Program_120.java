import java.util.*;
public class Program_120{

 //21. Write a C program to find power of a number using for loop.  

   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number : ");
     int num=sc.nextInt();

     System.out.println("Enter the power : ");
     int power=sc.nextInt();

     int i=1;
     int total=0;
     while(i<=power){
        total=i*num;
        i++;
     }
      System.out.println("power = "+total);
   }
}