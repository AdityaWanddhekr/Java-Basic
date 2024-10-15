import java.util.*;
public class Program_48{
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number : ");
     int num=sc.nextInt();
     /*System.out.println("Before Swapping is : "+num);
     int last=num%10;
     System.out.println("Last Digit is : "+last);
     int power=(int)Math.log10(num);
     System.out.println("Power is : "+power);
     int first=(int)(num/Math.pow(10,power));
     System.out.println("First digit is :"+first);
     int a=first*(int)Math.pow(10,power);
     System.out.println("position num is : "+a);
     int b=num%a;
     System.out.println("Remaing is : "+b);
     num=b/10;
     System.out.println("Only remaing middle : "+num);
     
     num=last*(int)Math.pow(10,power)+num*10+first;
     System.out.println("Swpaed numer is : "+num);*/

      double a=21.74;
      double last=(double)a%10;
      System.out.println(a%10);
      System.out.println(last);

 
     
   }
}