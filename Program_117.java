import java.util.*;

public class Program_117{

//18. Write a C program to find frequency of each digit in a given //integer. 

   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();
    
      
      
      int i=1;
      while(i<=9){
        int temp=num;
        int count=0;
         
         while(temp>0){
            int last=temp%10;
            if(last==i){
               count++;
            }
            temp/=10;
          
         }
       
         
         
         System.out.println(i+" = "+count);

          i++;
      }
    

      
     
   }
}