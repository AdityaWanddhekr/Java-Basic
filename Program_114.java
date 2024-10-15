import java.util.*;
public class Program_114{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();
 
      int i=1;
      while(i<=num){
        if(i%2!=0){
            System.out.print(i+" ");
        }
        i++;
      } 
   }
}