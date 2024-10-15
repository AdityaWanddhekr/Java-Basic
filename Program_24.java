import java.util.*;
public class Program_24{
//Write a program to find the number is divisible by 5 and 11 or not.
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the num : ");
     int num=sc.nextInt();
     String Divisible=(num%5==0 && num%11==0)?"Divisible":"Not Divisible";
     System.out.println(Divisible);
    

   }
}