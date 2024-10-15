import java.util.*;

public class Program_118{

//19. Write a C program to enter a number and print it in words. 

   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();
      int rev=0;
      
      while(num>0){
        int last=num%10;
        rev=rev*10+last;
        num/=10;
      }  
      
      while(rev>0){
 
         int last1=rev%10;    
        switch(last1){
          case 0:System.out.println("Zero");
                 break;
          case 1:System.out.println("One");
                 break;
          case 2:System.out.println("Two");
                 break;
          case 3:System.out.println("Three");
                 break;
          case 4:System.out.println("Four");
                 break;
          case 5:System.out.println("Five");
                 break;
          case 6:System.out.println("Six");
                 break;
          case 7:System.out.println("Seven");
                 break;
          case 8:System.out.println("Eight");
                 break;
          case 9:System.out.println("Nine");
                 break;
        }
        rev/=10;
      }
     

      
     
   }
}
