import java.util.*;
public class Program_128{

//29. Write a C program to find all prime factors of a number.

   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number : ");
     int num=sc.nextInt();

      int i=1;
      int fact=0;
      while(i<num){
        if(num%i==0){
           fact=i;
  

           int j=2;
           boolean flag=true;
           while(j<fact){
             if(fact%j==0){
                 flag=false;
                 break;
             }
            j++;
           }
          if(flag){
             System.out.println("Prime Fact = "+fact);
          }
        }
        
        i++;
      }
      
     
      
   }
}