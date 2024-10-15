import java.util.*;
public class Program_134{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();

      int range=1;
      int temp,last,i,fact,sum;
      while(range<=num)
     {
        sum=0; 
        temp=range;
        while(temp>0)
        { 
            last=temp%10;
            i=1;
            fact=1;
              while(i<=last)
                {
                    fact*=i;
                     i++;
                }
            sum=sum+fact;
          temp=temp/10;
         }
        
        if(sum==range)
          {
               System.out.println(range);
           }
       
        range++;
     } 
   }
}