import java.util.*;
public class Program_121{

 //22. Write a C program to find all factors of a number. 

   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number : ");
     int num=sc.nextInt();

     int i=1;
     while(i<num){
        if(num%i==0){
          System.out.println("factors = "+i);
         }
      i++;
     }
   }
}