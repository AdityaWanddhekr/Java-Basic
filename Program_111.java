import java.util.*;
public class Program_111{

//2. Write a C program to print all natural numbers in reverse (from n //to 1). - using while loop

   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();
    
      int i=10;
      while(num<=i){
        System.out.println(i);
        i--;
      }
   }
}