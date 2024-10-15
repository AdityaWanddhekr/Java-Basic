import java.util.*;
public class Program_145{

//1, 5, 25, 125, 625?

   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number : ");
     int num=sc.nextInt();

     int i=1;
     int count=0;

     while(i>=1){
       System.out.print(i+" "); 
       count++;
       i*=5;
       if(count==num){
         break;
       }
     }
   }
}