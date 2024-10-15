import java.util.*;
public class Program_163
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();
 
      int rev=0;
      for(;num>0;num/=10){
         int last=num%10;
         rev=rev*10+last;
  
      } 
       System.out.println("Rev = "+rev);
   


System.out.println("I  am Aditya Vijay Wandhekar.I am doing a training placement course at Giri's Tech Hub and I want a Job before Auguest of the 2024.");


}
}
