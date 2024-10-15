import java.util.*;
public class QuestionPaper_1_2
{
     // Reverse the 4 digit number without loop.
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number : ");
         int num=sc.nextInt();

         int rev=(num%10)*1000+((num/10)%10)*100+((num/100)%10)*10+(num/1000);
     
      
          System.out.println("Reverse = "+rev);
          
     }
}