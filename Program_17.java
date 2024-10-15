import java.util.*;
public class Program_17{
//Write a Program input three digit number and reverse it.
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number : ");
     int num=sc.nextInt();
    /*  
     int rev=0;
     int lastdigit=num%10;
     rev=rev*10+lastdigit;
     num/=10;
     
     lastdigit=num%10;
     rev=rev*10+lastdigit;
     num/=10;
     
     lastdigit=num%10;
     rev=rev*10+lastdigit;
     num/=10;
     System.out.println("The rev is : "+rev);*/

     num=(num%10)*100+((num/10)%10)*10+(num/100);

     System.out.println("The rev is : "+num);
      
   }
}