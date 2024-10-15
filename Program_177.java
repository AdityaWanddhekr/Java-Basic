import java.util.*;
public class Program_177
{
   public static void main(String[] args)
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
 
        int count=0;
        int last=0;
        while(num>0)
        {
          last=num%10;
          count++;
          num/=10;
          if(count==2)
          {
             System.out.println("Second last digit is :"+last);
          }
        }
   }
}