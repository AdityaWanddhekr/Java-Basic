import java.util.*;
public class Program_100{

//Enter the three digit number and find it is armstrong or not. 

   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number : ");
     int num=sc.nextInt();
     System.out.println(num%10);
     System.out.println((num/10)%10);
     System.out.println(num/100);
     double sum=Math.pow(num%10,3)+Math.pow((num/10)%10,3)+Math.pow(num/100,3);
     System.out.println("Sum is : "+sum);

     if(sum==num){
       System.out.println("It's a Armstrong number");
     }
     else{
       System.out.println("It's not a Armstrong number");
     }
     
   }
}