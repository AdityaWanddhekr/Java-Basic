import java.util.*;
public class Program_126{

//27. Write a C program to print all Prime numbers between 1 to n. 

   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number : ");
     int num=sc.nextInt();

      
      int i=2;
      
      while(i<=num){
         int j=2;
         boolean flag=true;
         while(j<i){
             if(i%j==0){
                flag=false;
                break;
             }
           j++;
          }
         if(flag){
            System.out.println(i);
          }
         i++;
      }
      
   }
}