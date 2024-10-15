import java.util.*;
public class Program_12{
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Principal : ");
     int p=sc.nextInt();

     System.out.println("Enter the Rate : ");
     int r=sc.nextInt();

     System.out.println("Enter the Time : ");
     int t=sc.nextInt();

     float SI=(float)(p*r*t)/100;
     System.out.println("The Simple Interest is : "+SI);
  }
}