import java.util.*;
public class Program_109{

//Check the number is armstrong number or not.

    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number : ");
       int num=sc.nextInt();
       int sum=0;
       int temp=num;
       while(num>0){
         int last=num%10;
         sum+=Math.pow(last,3);
         num/=10;
       }
       if(sum==temp){
         System.out.println("The number is Armstrong.");
       }
       else{
         System.out.println("The number is not Armstrong."); 
       }
    }
}