import java.util.*;
public class Program_69{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Year : ");
    int year=sc.nextInt();
    
    if(year%4==0){
       System.out.println("The Year is Leap.");
    }
    else{
       System.out.println("The Year is not Leap.");
    }
  }
}