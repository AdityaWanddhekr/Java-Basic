import java.util.*;
public class Program_115{

//6. Write a C program to find sum of all natural numbers between 1to //n.

  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number : ");
     int num=sc.nextInt();

     int i=1;
     int sum=0;
     while(i<=num){
       sum+=i;
       i++;
     }
     System.out.println(sum);
  }
}