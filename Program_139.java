import java.util.*;
public class Program_139{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int  num=sc.nextInt();
  
      int i=1; 
      int j=5;
      while(i<=num){
       
            if(i%2!=0){
                System.out.print(j+" ");
                j+=i;
           }
        i++;
      }
  
     
   }
}