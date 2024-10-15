import java.util.*;
public class Program_135{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();
 
      int i=1;
      int f1=-1;
      int f2=1;
      while(i<=num){
         int f3=f1+f2;
         f1=f2;
         f2=f3;
         System.out.println(f3);
         i++;
      }
   }
}