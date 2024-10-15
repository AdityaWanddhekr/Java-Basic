import java.util.*;
public class Program_154
{
   //1 3 5 7 9 11 13 15.
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number : ");
     int num=sc.nextInt();
     int j=1;
     for(int i=1;i<=num;i++)
     {
       
       System.out.print(j+" "); 
       j+=2;
     }
   }

}