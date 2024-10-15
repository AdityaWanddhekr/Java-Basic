import java.util.*;
public class Program_97{

/*Ramu has has instant noodals shop daily making 500 of noodles and serves to customers.
Instants noodles need 1 minute to ready and ramu has 2 stores to cook noodles.
write a program to calculate ramu serve noodles in 3 hours.
*/

   public static void main(String[] args){
     int noodles=500;
     int time_hr=3;
     int time_min=time_hr*60;
     System.out.println("The time in min : "+time_min);
   
     noodles=time_min*1;
     int total_noodles=noodles*2;
     System.out.println("The noodles made by ramu by 2 stores : "+total_noodles);
   }
}