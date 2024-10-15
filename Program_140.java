import java.util.*;
public class Program_140{

//5, 6, 9, 14.

   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number : ");
     int num=sc.nextInt();
 
     int i=1;
     int count=0;
     int j=5;
     while(i>=1)
     {
       
      
          System.out.print(j+" ");
          
          j+=i;
          i+=1;
          count++;
           
        
        if(count==num)
          {
            break;
          }
        i++;
     }
   }
}