import java.util.*;
public class Program_142{

 //1 3 7 15 31 .... ?

  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number : ");
     int num=sc.nextInt();

     int i=1;
     int count=0;
          while(i>=1)
          {
 
                System.out.print(i+" ");
                i=2*i; 
                count++;
       
                 if(count==num)
                 {
                     break;
                 }

                i++;
          }
     
     
  }
}