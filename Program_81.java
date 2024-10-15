import java.util.*;
public class Program_81{
// WAP to find the maximum between three number.
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number 1 : ");
      int num1=sc.nextInt();
       System.out.println("Enter the number 2 : ");
      int num2=sc.nextInt();
      System.out.println("Enter the number 3 : ");
      int num3=sc.nextInt();
 
      if(num1>num2){
       if(num1>num3){
          System.out.println("Num1 is greater");
       }
       else{
         System.out.println("Num3 is greater"); 
       } 
      }
     else{
       if(num2>num3){
        System.out.println("The num2 is greater !...");
       }
       else{
        System.out.println("The num3 is greater !...");
       }
      }
     

  }	
}
