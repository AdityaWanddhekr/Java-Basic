import java.util.*;
public class Program_116{

//15. Write a C program to calculate product of digits of a number. 

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();

        int product=1;
        while(num>0){
           int last=num%10;
           product*=last;
           num/=10;
        }
        System.out.println("Product is : "+product);
        
    }
}