import java.util.*;
public class Program_147{

//5, 10, 15, 20, 25, 30, 35, 40, 45, 50?

   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();

      int i=1;
      int count=0;
      while(i<=10){
        int j=i*5;
        
        System.out.print(j+" ");    
        
       i++;
      }

   }
}