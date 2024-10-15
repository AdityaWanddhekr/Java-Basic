import java.util.*;
public class Program_14{
   
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the subject 1 : ");
      int s1=sc.nextInt();
      System.out.println("Enter the subject 2 : ");
      int s2=sc.nextInt();
      System.out.println("Enter the subject 3 : ");
      int s3=sc.nextInt();
      System.out.println("Enter the subject 4 : ");
      int s4=sc.nextInt();
      System.out.println("Enter the subject 5 : ");
      int s5=sc.nextInt();
      System.out.println("Enter the subject 6 : ");
      int s6=sc.nextInt();

      int agg=s1+s2+s3+s4+s5+s6;
      float percentage=agg/6;

      System.out.println("The Percentage is : "+percentage+" %");
     
   }
}