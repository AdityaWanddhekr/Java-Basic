import java.util.*;
public class Program_206
{
  //Q. 2 Write a Java program to swap two integer numbers and swap numbers without using third variable
  public static void main(String[] args)
  {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number 1 : ");
       int num1=sc.nextInt();
       System.out.println("Enter the number 2 : ");
       int num2=sc.nextInt();

       System.out.println("num1  : "+num1);
       System.out.println("num2  : "+num2);

       num1=num1+num2;
       num2=num1-num2;
       num1=num1-num2;

       System.out.println("num1  : "+num1);
       System.out.println("num2  : "+num2);
       

  }
}