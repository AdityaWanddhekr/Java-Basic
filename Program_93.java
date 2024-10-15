import java.util.*;

//Write a program to prompt userInput to take no of telephone calls and calculate montholy telephone bill as per following.
//upto 100 calls -> 2 rs.
// next 50 calls -> 0.7 rs.
// next 50 class -> 0.6 rs.
// above 200 calls -> 0.5 rs.

public class Program_93{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the calls : ");
      int calls=sc.nextInt();
      double total=0;
      if(calls <=100){
         total=calls*2;
         System.out.println("The bill is : "+total);
      }
      else if(calls>100 && calls<=150){
         total=calls*0.7;
         System.out.println("The bill is : "+total);
      }
      else if(calls>150 && calls<=200){
         total=calls*0.6;
         System.out.println("The bill is : "+total);
      }
      else{
         total=calls*0.5;
        System.out.println("The bill is : "+total);
      }
   }
}