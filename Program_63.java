import java.util.*;
public class Program_63{

/*A study has shown that playing a musical instrument helps in increasing one's IQ by 77 points. Chef knows he can't beat Einstein in physics, but he wants to try to beat him in an IQ competition.
You know that Einstein had an IQ of 170170, and Chef currently has an IQ of XX.
Determine if, after learning to play a musical instrument, Chef's IQ will become strictly greater than Einstein's.
*/
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the chef's Current IQ : ");
      int chefIQ=sc.nextInt();
      int EinsteinIQ=170;
      System.out.println("Output : ");
      if(EinsteinIQ<(chefIQ+7)){
        System.out.println("YES");
      }
      else{
       System.out.println("NO");
      }

      
   }
}