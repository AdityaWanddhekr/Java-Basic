import java.util.*;
public class Program_30{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number 1 ");
    int num1=sc.nextInt();
    System.out.println("Enter the number 2 ");
    int num2=sc.nextInt();

    System.out.println("Enter the number 1 "+num1);
    System.out.println("Enter the number 2 "+num2);
    int temp=num1;
    num1=num2;
    num2=temp; 
    System.out.println("Enter the number 1 "+num1);
    System.out.println("Enter the number 2 "+num2);
    
    
  }
}