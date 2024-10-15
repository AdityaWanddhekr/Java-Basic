import java.util.*;
public class Program_33{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the base of the trangle : ");
    int base=sc.nextInt();
    System.out.println("Enter the height of the trangle : ");
    int height=sc.nextInt();
    double area=(double)1/2*(height*base);
    System.out.println("The area of the trangle is :"+area);
  }
}

