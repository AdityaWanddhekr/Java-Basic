import java.util.*;                           // to access the scanner class.+
public class Test_1
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");   
      int num=sc.nextInt();                     // take input n form user.

       int i=1; 
      
       while(i<=num)
      {
            
            int temp=i;
            int count=0; 
            while(temp>0)
            {                       // loop to count the digits.
              count++;
              temp/=10;
            }
            
            int sum=0;
            temp=i;
            while(temp>0){                        // loop to reach evert=y digit
          
               int last=temp%10; 
               int sq=(int)Math.pow(last,count); 
               sum+=sq;                           // for sum
               temp/=10;                         // for remaing.
           
            }
           
           if(sum==i)
           {
                 System.out.println(i);         // print armstrong numbers.
           }
         i++;                                  // increase the i value.
       } 
   }
}