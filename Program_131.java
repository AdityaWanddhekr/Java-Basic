import java.util.*;
public class Program_131{

//32. Write a C program to check whether a number is Perfect number or not.

   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number : ");
       int num=sc.nextInt();
       int sum=0;
       int temp=num;
      
          int i=1;
          while(i<num){
            if(num%i==0){
              sum+=i;
             }
           i++;
          }
         
       
       if(temp==sum){
         System.out.println("The number is Perfect!...");
       }
       else{
        System.out.println("The number is not Perfect!...");
       }

   }
}