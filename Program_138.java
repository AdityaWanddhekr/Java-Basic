import java.util.*;
public class Program_138{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number : ");
     int num=sc.nextInt();
     int sq=0;
     int sum=0;
     boolean flag=false;
     while(num>0 && num!=4){
         
         int sq1=0;
         int sum1=0;
       
            while(sum>0){
          
                   int last1=sum%10;
                   sq1=(int)Math.pow(last1,2);
                   sum1+=sq1;
                   sum/=10;
                   
             }

         System.out.println("num = "+sum1);
         num=sum1;
     } 
      
     
     if(num==1){
        System.out.println("The number is Happy!...");
      }
     else{
        System.out.println("The number is not Happy!...");
      }
     

   }
}