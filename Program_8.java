import java.util.*;
public class Program_8{
// Write a program to enter length in cm and convert it into meter and kilometer.
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a length : ");
   int length=sc.nextInt();
   float meter=(float)length/100;
   float kilometer=(float)meter/1000;
   System.out.println("Meter is : "+meter+" meter\n Kilometer is : "+kilometer+" kilometer");
   }
}