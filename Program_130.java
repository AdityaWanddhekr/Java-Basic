import java.util.*;
public class Program_130{

//31. Write a C program to print all Armstrong numbers between 1 to n.

   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();

      int i=1;
      while(i<=num){
         int sum=0;
         int temp=i;
         while(temp>0){
            int last=temp%10;
            sum+=Math.pow(last,3);
            temp/=10;
         }
         if(i==sum){
            System.out.println(i);
         }
        i++;
      }
   }
}