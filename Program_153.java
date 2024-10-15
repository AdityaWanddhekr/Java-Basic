import java.util.*;
public class Program_153
{
   // 1 3 7 25 31.
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number : ");
     int num=sc.nextInt();
 
     int j=1;
     for(int i=1;i<=num;i++)
     {
       System.out.print(j+" ");
       j=j*2+1;
     } 
   }
}