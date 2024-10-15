import java.util.*;
public class Program_64{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();
      int rev=(num%10)*100+((num/10)%10)*10+num/100;
      /*int last=num%10;
      num/=10;
      int first=num/100;
      num%=100;
      int rev=last*1000+num*10+first;*/
      System.out.println("Rev : "+rev);
   }
}