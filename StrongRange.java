import java.util.*;
public class StrongRange{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number :" );
      int num=sc.nextInt();

      int range=1;
      
      while(range<=num)
      {
         int temp=range;
         int sum=0;
         while(temp>0)
         {
             int last=temp%10;
             int fact=1;
             int i=1;
             while(i<=last)
             {
                 fact*=i;
                 i++;
             }
             sum+=fact;
             temp/=10;
         }
        if(sum==range){
           System.out.println(range);
        }
        range++;
      }
     
   }
}