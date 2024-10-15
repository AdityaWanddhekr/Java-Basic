import java.util.*;
public class Program_101{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the any digit number : ");
      int num=sc.nextInt();
      int rev=0;

      while(num>0){
          int last=num%10;
          rev=rev*10+last;
          num/=10;
       }

      System.out.println("Rev is : "+rev);
   }
}