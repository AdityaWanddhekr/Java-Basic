import java.util.*;
public class Program_144{

//0, 5, 10, 15, 20, 25, and 30 using a loop?

     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();

        int i=0;
        int count=0;

        while(i>=0){
          System.out.print(i+" ");
          i+=5;
          count++;
          if(count==num){
             break;
          }
        }
     }
  
}