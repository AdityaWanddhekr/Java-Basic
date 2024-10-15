import java.util.*;
public class Program_125{

//26. Write a C program to check whether a number is Prime number or not.

   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number : ");
     int num=sc.nextInt();

      boolean flag=true;
      int i=2;

      while(i<num){
         if(num%i==0){
           flag=false;
           break;
         }
        i++;
      }
      if(flag){
       System.out.println("It's a Prime Number.");
      }
      else{
       System.out.println("It's not a Prime Number.");
      }
   }
}