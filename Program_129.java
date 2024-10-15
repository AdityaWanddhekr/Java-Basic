import java.util.*;
public class Program_129{

//30. Write a C program to check whether a number is Armstrong number or not. 

    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the numbmer : ");
       int num =sc.nextInt();
       int temp=num;
       int sum=0;
       while(temp>0){
         int last=temp%10;
         sum+=Math.pow(last,3);
         temp/=10;
       }
       if(num==sum){
          System.out.println("The number is Armstrong number !...");
       }
       else{
          System.out.println("The number is not Armstrong number !...");
       }
    }
}