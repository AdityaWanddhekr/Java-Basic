import java.util.*;
public class Program_72{
  // Check weather the chacter is lowercase or uppercase.
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Character :  ");
      char ch=sc.nextLine().charAt(0);
      
      if(ch>='a' && ch<='z'){
         System.out.println("Enter the Character is LoerCase Alphabet :  ");
      }
      if(ch>='A' && ch<='Z'){
         System.out.println("Enter the Character :  ");
      }
    }
}