import java.util.*;
public class Program_207
{
     //Q. 5 write a java program to find the area of triangle. (take input as command line argument)
 
   public static void main(String args[])
   {
     int h=Integer.parseInt(args[0]);
     int b=Integer.parseInt(args[1]);

     double area=(double)1/2*(h*b);
     System.out.println("The area of Triangle is : "+area);
       
   }
}