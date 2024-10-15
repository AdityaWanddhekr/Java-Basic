import java.util.*;
public class Program_110{

//1. Write a C program to print all natural numbers from 1 //to n. - using while loop 

   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();

      int i=1; 
      while(i<=num){
        System.out.println(i);
        i++;
      }
   }
}