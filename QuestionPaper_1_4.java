import java.util.*;
public class QuestionPaper_1_4
{
     // Find area of trangle.
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the height : ");
         int h=sc.nextInt();
         System.out.println("Enter the base : ");
         int b=sc.nextInt();
        
         double area_of_trangle=(double)1/2*(h*b);
      
          System.out.println("Area of trangle = "+ area_of_trangle);
          
     }
}