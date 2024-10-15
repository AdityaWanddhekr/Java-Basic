import java.util.*;
public class Program_136{

//Neon number.

   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();
      int sq=(int)Math.pow(num,2);
      int sum=0;
      while(sq>0){
        int last=sq%10;
        sum+=last;
        sq/=10;
      }
   
      if(num==sum){
         System.out.println("The number is Neon Number.");
      } 
      else{
         System.out.println("The number is not Neon Number.");
      }
   } 
}