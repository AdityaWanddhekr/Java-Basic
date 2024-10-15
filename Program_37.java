import java.util.*;
public class Program_37{
 //Write a program to print the trangle is valid or not.
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the angle a :  ");
    int a=sc.nextInt();
    System.out.println("Enter the angle b :  ");
    int b=sc.nextInt();
    System.out.println("Enter the angle c :  ");
    int c=sc.nextInt();
    
    int trangle =a+b+c;
    String Trangle=(trangle ==180)?"The trangle is  valid ":"The trangle is not valid";
    System.out.println(Trangle);
    
  }
}