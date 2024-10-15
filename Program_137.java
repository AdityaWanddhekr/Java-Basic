import java.util.*;
public class Program_137{

 //Spy number.

   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();

      int sum=0;
      int prod=1;
      while(num>0){
        int last=num%10;
        sum+=last;
        prod*=last;
        num/=10;
      }
   
      if(prod==sum){
         System.out.println("The number is Spy Number.");
      } 
      else{
         System.out.println("The number is not Spy Number.");
      }
   } 
}