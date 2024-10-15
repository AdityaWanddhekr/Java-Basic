import java.util.*;
public class Program_56{
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the character");
     char ch=sc.nextLine().charAt(0);
     System.out.println("Before converting character is :"+ch);
     int charcter;
     if(ch>='a' && ch<='z'){
          charcter=ch-32;
          System.out.println("After converting character is UpperCase :"+ (char)charcter);
     }
     if(ch>='A' && ch<='Z')
     {
         charcter=ch+32;
         System.out.println("After converting character is LowerCase :"+ (char)charcter);
     }
  }
}