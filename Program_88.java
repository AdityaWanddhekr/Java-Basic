import java.util.*;
public class Program_88{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Choose from menu : \n 1)Revese Two digit number. \n 2)Revese Three digit number. \n 3)Revese Four digit number.");
      
      System.out.println("Enter your choice : ");
      int choice=sc.nextInt();

      System.out.println("Enter your Number : ");
      int num=sc.nextInt();
      int rev=0;
      switch(choice){
            case 1:rev=(num%10)*10+num/10;
                   System.out.println("Rev two digit num is : "+rev);
                   break;

            case 2:rev=(num%10)*100+((num/10)%10)*10+num/100;
                   System.out.println("Rev two digit num is : "+rev);
                   break;

            case 3:rev=(num%10)*1000+((num/10)%10)*100+((num/100)%10)*10+num/1000;
                   System.out.println("Rev two digit num is : "+rev);
                   break;
 
            default: System.outr.println("Invalid Input!...");
      }
   }
}