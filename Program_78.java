import java.util.*;
public class Program_78{
// WAP to find the alphabet is vowel or consonant.
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Character : ");
      char ch=sc.nextLine().charAt(0);
 
      if((ch>='a' && ch<='z') ||(ch>='A' && ch<='Z')){
        if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U'){
            System.out.println("The Character is Vowel !...");
        }
        else{
            System.out.println("The Character is Consonant !...");  
        }
      }
    
     else{
        System.out.println("Input is not Character!...");
      }


  }	
}
