import java.util.*;
public class Program_132{

//33. Write a C program to print all Perfect numbers between 1 to n. 

   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number : ");
       int num=sc.nextInt();
      
       int i=1;
       while(i<=num){
          int j=1;
          int sum=0;
          int temp=i;
          while(j<i){
            if(i%j==0){
              sum+=j;
             }
           j++;
          }

       if(i==sum){
         System.out.println("num = "+i);
       }
       

         i++;
        }
         
       
      

   }
}