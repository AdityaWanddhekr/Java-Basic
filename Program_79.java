import java.util.*;
public class Program_79{
// WAP to find the input is digit,chracter,or special symbol.
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Input : ");
      char ch=sc.nextLine().charAt(0);
 
      if((ch>='a' && ch<='z') ||(ch>='A' && ch<='Z')){
        System.out.println("The input is Alphabet !...");
      }
    
     else if(ch>='0' && ch<='9'){
        System.out.println("The input is Number !...");
      }
     else{
        System.out.println("The input is Special Symbol !...");
     }

  }	
}
