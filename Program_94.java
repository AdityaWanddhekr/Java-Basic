import java.util.*;
public class Program_94{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
    
     System.out.println("Enter the minutes of completing race of 1000 meter : ");
     int min=sc.nextInt();
     System.out.println("Enter the oxygen level of the candidate : "); 
     int oxy=sc.nextInt();

     if(min<=5 && oxy>90){
       System.out.println("The candidate is eligible for next Round.");
     }
     else{
       System.out.println("The candidate is not eligible for next Round.");
     }

   }
}