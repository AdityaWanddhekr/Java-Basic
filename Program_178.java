import java.util.*;
public class Program_178
{
   public static void main(String[] args)
   {
      int num=Integer.parseInt(args[0]);
      
      int count=0;
      int i=2;
      boolean flag=true;
      while(i<num){
          
        if(num%i==0){
               flag=false;
               break;
            }
         
          i++;
        }

        if(flag){
            
             System.out.println("num is Prime!...");
            
          } 
        else{
            System.out.println("num is not Prime!...");
         }
      }
   }
