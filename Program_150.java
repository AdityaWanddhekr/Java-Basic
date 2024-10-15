import java.util.*;
public class Program_150
{

   //1 2 3 = 3 2 1.
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number : ");
       int num=sc.nextInt();

       int rev=0;
       int sum=0;
       while(num>0)
       {
          int last=num%10;
          rev=rev*10+last;
          sum+=last;
          num/=10;
       }
       System.out.println("rev = "+rev);
       System.out.println("sum = "+sum);
       
   }
}