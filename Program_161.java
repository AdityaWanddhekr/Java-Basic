import java.util.*;
public class Program_161
{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number : ");
       int num=sc.nextInt();
      for(int i=1;i<=num;i++)
      {
            boolean flag=false;
            int temp=i;
            for(;temp>0;temp/=10)
            {
                  int last=temp%10;
                  if(last==0)
                  {
                      flag=true;
                      break;
                  }
            }
 
            if(flag)
            {
              System.out.print(i+" ");
            }
           
      }
   }
}