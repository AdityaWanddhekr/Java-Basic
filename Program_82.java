import java.util.*;
public class Program_82{
// WAP to find calculate the gross salary of the employee.
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Salary : ");
      double Salary=sc.nextInt();
 
      if(Salary<=10000){
         Salary=Salary+(Salary*0.2*0.8);
         System.out.println("The Salary is : "+Salary);
      }
      else if(Salary>=10000 && Salary<=20000){
         Salary+= Salary*0.25*0.9;
         System.out.println("The Salary is : "+Salary);
      }
     else{
         Salary+= Salary*0.3*0.95;
         System.out.println("The Salary is : "+Salary); 
      }
     
  }	
}
