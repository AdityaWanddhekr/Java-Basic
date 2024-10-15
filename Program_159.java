import java.util.*;
public class Program_159
{
   // Armstrong number.
   public static void main(String[] args)
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        int count=0;
        int temp=num;
        for(;num>0;num/=10){
           count++;
        }
        System.out.println("count = " + count);
         num=temp;
         int sq=0;
         int sum=0; 
         int last=num%10; 
        for(int i=1;i<=count;i++){
           
           sq=last*count;
           sum+=sq;
        }
        System.out.println("sum = "+sum);
        if(sum==temp){
           System.out.println("The number is Armstrong Number!...");
        }
        else{
           System.out.println("The number is not Armstrong Number!...");
         }
       
   }
}