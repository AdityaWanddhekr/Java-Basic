import java.util.*;
public class Program_146{

//3, 6, 9, 12, 15 in terms?

   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number : ");
       int num=sc.nextInt();
       
       int i=1;
       int count=0;

       while(i>=1){
         int j=i*3;
         System.out.print(j+" ");
         count++;

         if(count==num){
            break;
         }
         i++;
       }
   }
}