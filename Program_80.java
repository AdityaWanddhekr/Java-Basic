import java.util.*;
public class Program_80{
// WAP to find the Character is uppercase or lowercase.
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Input : ");
      char ch=sc.nextLine().charAt(0);
 
      if((ch>='a' && ch<='z')){
        System.out.println("The Alphabet is LowerCase !...");
      }
    
     else if((ch>='A' && ch<='Z')){
        System.out.println("The Alphabet is UpperCase !...");
      }
     else{
        System.out.println("The input is not alphabet !...");
     }

  }	
}
