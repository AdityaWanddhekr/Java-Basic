import java.util.*;
public class Program_25{
  //Write a program to check weather a year is leap or not.
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int year=sc.nextInt();
    String Year=(year%4==0)?"Leap Year":"Not Leap Year";
    System.out.println(Year);
  }
}