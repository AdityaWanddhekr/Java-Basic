import java.util.*;
public class Program_209
{
  /* 
      Program 4.  Write a Menu driven program for following operations 
                 a. Sum of Digits of Given Number 
                 b. Count number of digits in given number 
                 c. Reverse the given Number
  */
 
  public static void main(String[] args)
  {
    
      int choice;
    do{ 

           Scanner sc=new Scanner(System.in);
           System.out.println("Here is your Menu : ");
           System.out.println("a. Sum of Digits of Given Number\n  b. Count number of digits in given number\n c. Reverse the given Number ");
           System.out.println("Select the menu : ");
           char ch=sc.nextLine().charAt(0);
     
          
           int num1;
     switch(ch)
      {
         case 'a':System.out.println("Enter the number 1 : "); 
                  num1=sc.nextInt();
                  int sum=0; 
                  while(num1>0){
                     int last=num1%10;
                     sum+=last;
                     num1/=10;
                  }
                  System.out.println("Sum is : "+sum); 
                  break;
        case 'b':System.out.println("Enter the number 1 : "); 
                  num1=sc.nextInt();
                  int count=0;
                  while(num1>0){
                     int last=num1%10;
                     count++;
                     num1/=10;
                  }
                  System.out.println("Count is : "+count); 
                  break;
        case 'c':System.out.println("Enter the number 1 : "); 
                  num1=sc.nextInt();
                  int rev=0;
                  while(num1>0){
                     int last=num1%10;
                     rev=rev*10+last;
                     num1/=10;
                  }
                  System.out.println("Rev is : "+rev); 
                  break;
 
        default: System.out.println("Invalid Input");

      
      }
        System.out.println("Press 1 for yes and 0 for no.");
        choice=sc.nextInt();
    }while(choice==1);
  }
}