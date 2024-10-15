import java.util.*;
public class Program_91{
   // WAP to print the number is positive or negative.
   public static void main(String[] args){

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();
      int type=(num>0)?1:2;

     switch(type){
         case 1: System.out.println("Positive");
                 break;
         case 2: System.out.println("Negative");
                 break;
       
         default: System.out.println("Invalid Input !...");
                
     }
   }
}