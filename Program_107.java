import java.util.*;
public class Program_107{
  //check weather the number is palindrome or not.
    
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number : ");
       int num=sc.nextInt();
       int rev=0;
       int temp=num;
       while(num>0){
          int last=num%10;
          rev=rev*10+last;
          num/=10;
       }
       
       if(temp==rev){
          System.out.println("The number is palindrome.");
       }
       else{
          System.out.println("The number is not palindrome.");
       }
    }
}