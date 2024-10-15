import java.util.*;
public class Program_71{
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the character : ");
    char ch=sc.nextLine().charAt(0);

    if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
      System.out.println("The charcter alphabet !...");
    }
    if((ch>='1' && ch<='9'))
    {
      System.out.println("It's a Digit !...");
    }
    

   }
}