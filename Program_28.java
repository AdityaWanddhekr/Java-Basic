import java.util.*;
public class Program_28{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the character : ");
     char ch=sc.next().charAt(0);
     String Type=(ch>='a' && ch<='z')?"Character is lowerCase":(ch>='A'&& ch<='Z')?"Chracter is UpperCase":"It is not Chracter";
      System.out.println(Type);
   }
}
