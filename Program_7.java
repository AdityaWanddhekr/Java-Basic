import java.util.*;
public class Program_7{
// Write a program to enter radius of circle and  calculate its diameter,circumference and area.
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the radius : ");
     int redius=sc.nextInt();
     int diameter=2*redius;
     float PI=3.14f;
     float cercumference=2*PI*redius;
     float area=PI*(redius*redius);
     System.out.println("Diameter is : "+diameter);
     System.out.println("Cercumference is : "+cercumference); 
     System.out.println("Area is : "+area);
     } 

}
