import java.util.*;
public class Program_29{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the cost Price : ");
    int cost=sc.nextInt();
    System.out.println("Enter the selling Price : ");
    int sell=sc.nextInt();
    
    String Result=(cost>sell)?"Loss":"Profit";
    System.out.println(Result);

  }
}