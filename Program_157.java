import java.util.*;
public class Program_157
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();

      int p=1,q;
      for(int i=1;i<=num;i++)
      {
        p=p+2;
        System.out.print(p+" "); 
        q=p;;
        q=q+2;
        System.out.print(q+" "); 
        System.out.print(p*p+" "); 
        System.out.print(q*q+" "); 
        p=p+2;

 
      }
   }
}