import java.util.*;
public class Program_92{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of a : ");
    int a=sc.nextInt();
    System.out.println("Enter ths value of b : ");
    int b=sc.nextInt();

    int type=(a>b)?1:2;
  
    switch(type){
       case 1: System.out.println("The big is : "+a);
               break;

       case 2: System.out.println("The Big is : "+b);
               break;

       default: System.out.println("Invalid Input!..."); 
    }
  }
}