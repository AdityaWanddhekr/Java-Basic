import java.util.*;
public class Program_61{
    /*To access CRED programs, one needs to have a credit score of 750 or more.
     Given that the present credit score is XX, determine if one can access CRED programs or not.
     If it is possible to access CRED programs, output \text{YES}YES, otherwise output \text{NO}NO.
     */
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the credit score : ");
      int score=sc.nextInt();
      int need=750;

      if(score>=need){ 
        System.out.println("YES");
      }
      else{
        System.out.println("NO");
      }
   }
}