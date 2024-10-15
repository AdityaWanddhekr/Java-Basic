import java.util.*;
public class Program_38{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the angle a :  ");
    int a=sc.nextInt();
    System.out.println("Enter the angle b :  ");
    int b=sc.nextInt();
    System.out.println("Enter the angle c :  ");
    int c=sc.nextInt();
   
    String Type=(a==b && b==c && a==c)?"The trangle is Equilateral":(a==b || b==c || a==c)?"The trangle is Isoscale":"The trangle is Scalene";
    System.out.println(Type);
  }
}