import java.util.*;
public class Program_210
{
    //Program 1. Write a Java program to display all  Armstrong numbers from 1 to N (Take N from user).
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number : ");
     int num=sc.nextInt();

     int i=1;
     while(i<=num)
     {  
        int temp=i;
        int count=0;
        while(temp>0)
        {
           int last=temp%10; 
           count++;
           temp/=10;
        }  
        temp=i;
        int sum=0;
        while(temp>0)
        {
           int last=temp%10;
           int sq=(int)Math.pow(last,count);
           sum+=sq;
           temp/=10;
        }    

        if(sum==i)
        {
          System.out.println(i);
        }


        i++;
     }
   }
}