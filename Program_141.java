import java.util.*;
public class Program_141{

//-2, -4, -6, -8, -10, -12…n?

  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number : ");
     int num=sc.nextInt();

     int i=0;
     int sign=1;
     int count=1;
     sign=-sign;
     while(i>=0)
     {   i++;
       if(i%2==0)
       {
           System.out.print((-i)+" ");
           count++;
       }
       if(count==num)
       {
         break;
       }
    
     }
     
  }
}



/*

if(i%2==0)
          {
             i=i*sign;
             System.out.print(i+" ");
             count++;
             if(count==num)
              {
                  break;
              }
         
          }
       i++;

*/