import java.util.*;
public class Program_103{
// Swap midlle digit of the number.
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();
      int count=0;
      int temp=num;
     
     
      while(temp>0){
          
         temp/=10;
         
         count++;
      }
      System.out.println("Count = "+count);
    
       int i=1;
       int x=1;
       while(i<count){
          x=x*10;
          i++;
       }
       int first=num/x;
       int last=num%10;
       int mid=(num%x)/10;
       System.out.println("First = "+first);
       System.out.println("last = "+last);
       System.out.println("mid = "+mid);
       int rev=0;
       while(mid>0){
           int last1=mid%10;
           rev=rev*10+last1;
           mid/=10;

        }
        System.out.println("Rev = "+rev);
        int reverse=first*x+rev*10+last;
        System.out.println("Reverse = "+reverse);
     
      
   }
}