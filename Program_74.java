import java.util.*;
public class Program_74{
// WAP to find the number is positive or negative or Zero.
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();
 
      if(num>0){
        System.out.println("The number is Positive !...");
      }
     else if(num<0){
        System.out.println("The number is Negative !...");
      }
     else{
        System.out.println("The number is Zero !...");
      }

  }	
}
