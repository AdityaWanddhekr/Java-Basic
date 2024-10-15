import java.util.*;
public class Program_16{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();
      
      int remain=num/10;
      System.out.println("The after removing last digit the number is : "+remain);
   }
}