import java.util.*;
public class Program_39{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num=sc.nextInt();
    String Type=(num>0)?"The number is Positive":(num<0)?"The number is Negative":"The numbe is Zero";
    System.out.println(Type); 
  
  }
}
