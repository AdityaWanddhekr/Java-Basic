import java.util.*;
public class QuestionPaper_1_3
{
     // Swap first and last digit using loop.
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number : ");
         int num=sc.nextInt();

         int temp=num;
         int count=0;
         while(temp>0){
           count++;
           temp/=10;
         }
         System.out.println("count = "+count);

         int i=1;
         int x=1;
         while(i<count){
           x=x*10;
           i++;
         }
         int last=num%10;
         int first=num/x;
         int mid=(num%x)/10;
         System.out.println("x = "+x);
         System.out.println("last = "+last);
         System.out.println("first = "+first);
         System.out.println("mid = "+mid);
          
         int swap=(last*x)+mid*10+first;
         System.out.println("Swap = "+swap);
     }
}