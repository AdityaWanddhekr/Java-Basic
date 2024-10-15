import java.util.*;
public class Program_160
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();
   
for(int i=1;i<=num;i++)
{
       int range=i;
      for(;range!=1 && range!=4;)
      {
         int sum=0;
         int temp=range;
         for(;temp>0;temp/=10)
         {
              int last=temp%10;
              int sq=last*last;
              sum+=sq;
         }
        range=sum;
 
      }
      if(range==1)
       {
         System.out.print(i+" ");
       
       }
 }
   }


}