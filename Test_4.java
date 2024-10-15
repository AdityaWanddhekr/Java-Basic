import java.util.*;
public class Test_4
{
     public static void main(String[] args)
     {
          Scanner sc=new Scanner(System.in);
         

          System.out.println("chose the menu : ");
          System.out.println("a) sum of the Digit ");
          System.out.println("b) count the digit ");
          System.out.println("c) Reverse the number ");

           System.out.println("Enter the number : ");
           int num=sc.nextInt();                      // input number form user


          System.out.println("Enter the choice : ");
          char ch=sc.next().charAt(0);                       // input choice form user.
          
          

          switch(ch)
          {
             case 'a':  int sum=0;
                      while(num>0){                         // loop to reach every number
                        int last=num%10;
                        sum+=last;                         // for sum
                        num/=10;
                      }
                        System.out.println("Sum = "+sum);
                        break;
             
             case 'b': int count=0;
                     while(num>0){                        // loop to reach every number
                        count++;                         // increse count
                        num/=10;
                     } 
                     System.out.println("Count = "+count);
                     break;


             case 'c':  int rev=0;
                     
                      while(num>0){                     // loop to reach every number
                        int last=num%10;
                        rev=rev*10+last;                   // for reverse
                        num/=10;
                     } 
                     System.out.println("Rev = "+rev);
                     break;
    
             default: System.out.println("Invalid Input");
          }
     }
}