import java.util.*;
public class Program_148{

//1, 4, 9, 16, and 25?

   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();

      int i=1;
      int count=0;
      while(i>=1){
        
        int j =i*i;
        System.out.print(j+" ");
        count++; 
       
        if(count==num){
          break;
        }
       i++;
      }
      
   }
}