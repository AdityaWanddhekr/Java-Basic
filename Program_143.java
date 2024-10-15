import java.util.*;
public class Program_143{

//1, 3, 5, 7, 9 up to 25^th terms?

   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();
 
      int i=1; 
      int count=0;
      while(i>=1){
         if(i%2!=0){ 
          
          System.out.print(i+" ");
          count++;
         }
        if(count==num){
           break;
        }
        i++;
      }
      
   }
}