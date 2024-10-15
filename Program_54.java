import java.util.*;
public class Program_54{
//Write a program swap the two digits in given 3 digit number.
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num=sc.nextInt();
    
    int last=num%10;
    num/=10;
    int first=num/10;
    num%=10;
    
    int rev=last*100+num*10+first;
    System.out.println(rev);

  }
}