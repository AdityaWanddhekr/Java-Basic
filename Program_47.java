import java.util.*;
public class Program_47{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number : ");
     int num=sc.nextInt();
     
     if(num<0){
       num*=-1;
     }
     int length=Integer.toString(num).length();
     if(length==1){
        System.out.println("Second last Digit is : -1 ");
     }
     int count=0;
     while(num>0){
       int last=num%10;
       count++;
       num/=10;
         if(count==2){
           System.out.println("Second last Digit is : "+last);
         } 
     }
   }
}