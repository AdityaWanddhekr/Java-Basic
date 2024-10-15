import java.util.*;
public class Program_35{
// Write a program to enter the marks of five subjects and calculate the total marks and the percentage.
  
public static void main(String[] args){

    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the mark of subject 1 : ");
    int sub1=sc.nextInt();

    System.out.println("Enter the mark of subject 2 : ");
    int sub2=sc.nextInt();

    System.out.println("Enter the mark of subject 3 : ");
    int sub3=sc.nextInt();

    System.out.println("Enter the mark of subject 4 : ");
    int sub4=sc.nextInt();

    System.out.println("Enter the mark of subject 5 : ");
    int sub5=sc.nextInt();

    int total=sub1+sub2+sub3+sub4+sub5;

    System.out.println("The total marks is : "+total);

    double percentage=total/5;

    System.out.println("The Percentage is : "+percentage+" %");
  }
}