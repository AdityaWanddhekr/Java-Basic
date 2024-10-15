import java.util.*;
public class Program_21{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int last=num%10;
      System.out.println(last);
      num=num/10;
      int first=num%10;
      System.out.println(first);
      num=num/10;
      num=last*100+first*10+num;
      System.out.println(num);
   }
}