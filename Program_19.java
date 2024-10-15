import java.util.*;
public class Program_19{
// Write a program to reverse the number.
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        
        int last=num%10;
        num/=10;
        int num1=last*100;
        last=num%10;
        num/=10;
        int num2=last*10;
       num=num1+num2+num;
       System.out.println("The Reverse number is : "+num);
    }
}