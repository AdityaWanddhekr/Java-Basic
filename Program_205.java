import java.util.*;
public class Program_205
{
   //Q. 1 Write a java program to take a 4 digit number as command line argument, reverse the number and also find the sum of digits.
   public static void main(String args[])
   {
       int num=Integer.parseInt(args[0]);
       System.out.println("Num = "+num);
       int rev=(num%10)*1000+((num/10)%10)*100+((num/100)%10)*10+(num/1000);
       System.out.println("Rev = "+rev);
    
       int sum=0;
       int last=num%10;
       sum+=last;
       num/=10;
 
       last=num%10;
       sum+=last;
       num/=10;
 
       last=num%10;
       sum+=last;
       num/=10;

       last=num%10;
       sum+=last;
       num/=10;
 
        System.out.println("Sum = "+sum);
   }
}