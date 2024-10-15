import java.util.*;
public class Program_83{
// WAP to find calculate the gross salary of the employee.
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Salary : ");
      int num=sc.nextInt();
      int rev=(num%10)*100+((num/10)%10)*10+num/100;
      System.out.println("Rev is : "+rev);
 
      if(rev==num){
         System.out.println("The number is Palindrome");
      }
     else{
         System.out.println("The number is not Palindrome"); 
      }
     
  }	
}
