import java.util.*;
public class Program_102{

//Swap the first and last digit of the number .

   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number :  ");
     int num=sc.nextInt();
     
     int count=0;
     int first=0;
     int last=0;
     int mid=0;
     int temp=num;
 
     while(temp>0){
        count++;
        temp=temp/10;
     }
     System.out.println("Count is : "+count);

     int i=1;
     int x=1;
     while(i<count){
       x=x*10;
       i++;
     }
   
     last=num%10;
     first=num/x;
     mid=(num%x)/10;
   
     System.out.println("last = "+last);
      System.out.println("first = "+first);
       System.out.println("mid = "+mid);

     int rev=last*x+mid*10+first;
     System.out.println("Rev = "+rev);
   }
}