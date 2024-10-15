import java.util.*;
public class Program_172
{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number : ");
       int num=sc.nextInt();
   
       
       for(int i=1;i<=num;i++)
       {
          for(int j=5;j>i;j--)
          {
             System.out.print(" ");
          }
          
          for(int j=i;j<=(2*i)-1;j++)
          {
             System.out.print(j);
          }
          
          for(int j=(2*i)-2;j>=i;j--)
          {
             System.out.print(j);
          }
        
         System.out.println();
        
       }
       
   }
}