import java.util.*;
public class Program_151
{

   // 3 5 9 25 7 9 49 . . . .

   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number : ");
       int num=sc.nextInt();
  
       int i=1;
       int p=1,q;
       int count=0;
       while(i>=1){
         count++;
         p=p+2;
         System.out.print(p+" ");
         q=p;
         q=q+2;
         System.out.print(q+" ");
         System.out.print((p*p)+" ");
         System.out.print((q*q)+" ");
         p=p+2;
         
      
         if(count==num){
           break;
         }
         i++;
       }
   }
}