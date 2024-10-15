import java.util.*;
public class Program_127{

//28. Write a C program to find sum of all prime numbers between 1 to n.

   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number : ");
     int num=sc.nextInt();

      
      int i=2;
      int sum=0;
      while(i<=num){
         int j=2;
         boolean flag=true;
         while(j<i){
             if(i%j==0){
                flag=false;
                break;
             }
           j++;
          }
         if(flag){
            sum+=i;
            System.out.println(i);
          }
         i++;
      }
     System.out.println("sum = "+sum);
      
   }
}