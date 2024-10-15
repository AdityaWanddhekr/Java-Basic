import java.util.*;
public class Program_113{

//4. Write a C program to print all even numbers between 1 to 100. - //using while loop

    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number : ");
       int num=sc.nextInt();
      
       int i=1;
       while(i<=num){
          if(i%2==0){
             System.out.println(i);
          }
         i++;
       }

    }
}