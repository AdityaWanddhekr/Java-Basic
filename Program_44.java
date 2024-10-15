import java.util.*;
public class Program_44{
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Four the number");
     int num=sc.nextInt();//1234;
     int last=num%10;
     num/=10;
     int first=num/100;
     num%=100;
     num=last*1000+num*10+first;
     System.out.println(num);
  }
}