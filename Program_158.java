import java.util.*;
public class Program_158
{

   //5 6 9 14 21 
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();
   
      int count=0;
      int j=5;
      for(int i=1;i>=1;i++)
      {
         if(i%2!=0){
            System.out.print(j+" ");
            j+=i;
            count++;
            
         }
         if(count==num) 
         {
            break;
         }
      }
   }
}