import java.util.*;
public class Program_99{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println(" 1) Swap by add and sub \n 2)Swap by multi and div \n 3) Swap by bitwise Operater.");
      System.out.println("Enter the Choice : ");
      int choice=sc.nextInt();
      System.out.println("Enter the a : ");
      int a=sc.nextInt();
      System.out.println("Enter the b : ");
      int b=sc.nextInt();
   
      switch(choice){
        case 1 : a=a+b;
                 b=a-b;
                 a=a-b;
                 System.out.println("a = "+a+" b = "+b);
                 break;
       
        case 2 : a=a*b;
                 b=a/b;
                 a=a/b;
                 System.out.println("a = "+a+" b = "+b);
                 break;
        case 3 : a=a^b;
                 b=a^b;
                 a=a^b;
                 System.out.println("a = "+a+" b = "+b);
                 break;

        default:System.out.println("Invalid Input.");
      }
   }
}