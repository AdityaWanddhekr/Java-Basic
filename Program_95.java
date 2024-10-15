import java.util.*;
public class Program_95{
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Traffic light : ");
     char light=sc.nextLine().charAt(0);

     switch(light){
 
        case 'R':System.out.println("Stop the vehicle !...");  
        break;

        case 'G':System.out.println("You can Go !...");  
        break;

        case 'Y':System.out.println("Get Ready to go !...");  
        break;

        case 'W':System.out.println("Automated cars dectating the traffic flow !...");  
        break;

        default: System.out.println("The Invalid Input !...");
     }
     
  }
}






/*import java.util.*;

public class Program_96{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();
      int rev=0;
      int first=0;
      int end=num%10;
      num/=10;//123
      System.out.println("num = "+num);
      while(num>0){
        
         int last=num%10;
         rev=rev*10+last;//321 
         num/=10;
         //first=rev%10;//1
         first=rev%10;
        
      }
      rev/=10;
     System.out.println("num : "+num);
      System.out.println("First : "+first);
     System.out.println("Rev : "+first+""+rev+""+end);
      System.out.println("end is : "+end);
      System.out.println("rev is : "+rev);
   }
}*/