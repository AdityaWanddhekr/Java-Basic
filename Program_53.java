import java.util.*;
//WAP to check weather the charcter is uppercase or lowercase. 
public class Program_53{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the charcter : ");
       char ch=sc.nextLine().charAt(0);
       String Type=(ch>='a' && ch<='z')?"LowerCase":(ch>='A' && ch<='Z')?"UpperCase":"Invalid Input";
       System.out.println(Type);
   }
}