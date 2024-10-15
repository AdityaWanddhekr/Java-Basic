import java.util.*;
public class Program_89{
// Menu driven Arethimatic operations.
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);

      System.out.println("Choose from menu : \n 1)Addition. \n 2)Substraction. \n 3)Multiplication. \n 3)Division."); 

      System.out.println("Enter your choice : ");
      int choice=sc.nextInt();

      System.out.println("Enter the a : ");
      int a=sc.nextInt();
      System.out.println("Enter the b : ");
      int b=sc.nextInt();

      switch(choice){
        case 1:int sum=a+b;
               System.out.println("Sum is : "+sum);
               break;

        case 2:int sub=a-b;
               System.out.println("Substraction is : "+sub);
               break;

        case 3:int mul=a*b;
               System.out.println("Multiplication is : "+mul);
               break;

        case 4:int div=a/b;
               System.out.println("Division is : "+div);
               break;

        default:System.out.println("Invalid Input!...");


      }
     
      
      
   }
}