import java.util.*;
   public class Program_133{

//34. Write a C program to check whether a number is Strong number or not.

      public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the number : ");
          int num=sc.nextInt();//123.  (3*2*1)+(2*1)+(1).
          int temp=num;
          int sum=0;
          while(temp>0){
             int last=temp%10;//3;
             int i=1;
             int fact=1;
           
             while(i<=last){
                fact*=i;
                i++;
             }
             sum+=fact;
             temp/=10;
            
          }
          
             
             if(num==sum){
                 System.out.println("It's a Strong number!...");
             }
             else{
                System.out.println("It's not a Strong number!...");
             }
          
          
     
      }
   }
