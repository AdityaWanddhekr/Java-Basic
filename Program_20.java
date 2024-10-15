import java.util.*;
public class Program_20{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        int pow=(int)Math.log10(num);
        int lastDigit=num%10;
        int firstDigit=num/(int)Math.pow(10,pow);
        System.out.println("The number is : "+num);
        System.out.println("The power is : "+pow); 
        System.out.println("The lastDigit is : "+lastDigit); 
        System.out.println("The firstDigit is : "+firstDigit);
        int a=firstDigit*(int)Math.pow(10,pow);
        int b=num%a;
        num=b/10;
        System.out.println("The a is : "+a);
        System.out.println("The b is : "+b);
        num=lastDigit*(int)Math.pow(10,pow)+num*10+firstDigit;
        System.out.println("The swaped digits are "+num);

    }
}