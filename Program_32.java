import java.util.*;
public class Program_32{
// Write a program to enter two angle of the trangle and find the third angle of the trangle.
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter angle a : ");
     int a=sc.nextInt();
     System.out.println("Enter angle b : ");
     int b=sc.nextInt();
     int c=180-(a+b);
     System.out.println("The Third angle of the trangle is : "+c);

   }
}