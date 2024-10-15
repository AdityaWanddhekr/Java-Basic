import java.util.*;
public class Program_90{
// Menu driven Areas of Geomatrical Shapes.
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);

      System.out.println("Choose from menu : \n 1)Area of Circle. \n 2)Area of Trangle. \n 3)Area of Rectangle. \n 3)Area of Square."); 

      System.out.println("Enter your choice : ");
      int choice=sc.nextInt();

      
      switch(choice){

        case 1:System.out.println("Enter the radius : ");
               int r=sc.nextInt();
               double Area_C=(3.14*r*r);
               System.out.println("Area of circle is : "+Area_C);
               break;

        case 2:System.out.println("Enter the h : ");
               int h=sc.nextInt();
               System.out.println("Enter the b : ");
               int br=sc.nextInt();

               double Area_Tri=(double)1/2*(h*br);
               System.out.println("Area of Triangle : "+Area_Tri);
               break;
           
        case 3:System.out.println("Enter the l : ");
               int l=sc.nextInt();
               System.out.println("Enter the b : ");
               int b=sc.nextInt();

               int Area_rec=l*b;
               System.out.println("Area of Rectangle : "+Area_rec);
               break;

        case 4:System.out.println("Enter the side : ");
               int side=sc.nextInt();
              

               int Area_sq=side*side;
               System.out.println("Area of Square : "+Area_sq);
               break;

        default:System.out.println("Invalid Input!...");


      }
     
      
      
   }
}