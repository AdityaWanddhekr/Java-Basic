import java.util.*;
public class Vowel
{
   public static void main(String x[])
    {
         Scanner xyz=new Scanner(System.in);
          System.out.println("Enter the char");
          char ch=xyz.next().charAt(0);
          String result=(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' ||        ch=='U') ? "Vowel":"Consonent";

System.out.println("The char is :"+result);
}
}