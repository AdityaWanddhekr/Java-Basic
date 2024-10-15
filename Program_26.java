import java.util.*;
public class Program_26{
//Write a program to input alphabet and print it is vowel or consonant.
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the charcter : ");
     char ch=sc.next().charAt(0);
    // String Type=((ch=='a'|| ch=='A') && (ch=='e'|| ch=='E') && (ch=='i'|| ch=='I') && (ch=='o'|| ch=='O') && (ch=='u'|| //ch=='U'))?"Its a Vowel":"Its a Consoanant";

     String type=((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')||(ch>='a' && ch<='z'))? "Vowel":"Consonant";
     System.out.println(type);
   } 
}