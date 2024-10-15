import java.util.*;
public class Program_11{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int resistance,voltage,current;
   System.out.println("Enter the Vlotage : ");
    voltage=sc.nextInt();
   System.out.println("Enter the Current : ");
    current=sc.nextInt();
   
   resistance=voltage/current;
   current=voltage/resistance;
   voltage= current*resistance;
   System.out.println("The Resistance is : "+resistance+"\n Current is : "+current+"\n Voltage is : "+voltage);
   }
}