import java.util.*;
public class Program_176
{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
      
      
       System.out.println("Enter the number : ");
       int num=sc.nextInt();
     
       for(int i=1;i<=num;i++)
       {
           char ch='A';
          for(int j=1;j<=i;j++)
          {
             System.out.print(ch+" ");
              ch++;
          }
          
         
         System.out.println();
        
       }

       for (int i = 1; i <= 5; i++) {
            char ch = 'E';
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(ch);
                ch--;

            }
            System.out.println();
        }


   }
}