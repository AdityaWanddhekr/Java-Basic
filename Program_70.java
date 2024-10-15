import java.util.*;
public class Program_70{
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the character : ");
    char ch=sc.nextLine().charAt(0);

    if((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')||(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')){
      System.out.println("The alphabet is Vowel !...");
    }
    else{
      System.out.println("The alphabet is Consonant !...");
    }
   }
}