import java.util.*;
public class Program_75{
// WAP to find the charcter is alphbet or not..
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      char ch=sc.nextLine().charAt(0);
 
      if((ch>='a' && ch<='z') ||(ch>='A' && ch<='Z')){
        System.out.println("The Character is Alphabet !...");
      }
    
     else{
        System.out.println("Input is not Character!...");
      }

  }	
}
