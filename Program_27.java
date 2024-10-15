import java.util.*;
public class Program_27{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the character");
    char ch=sc.next().charAt(0);

    String Type=((ch>='a'&&ch<='z') || (ch>='A' && ch<='Z'))?"It is a Alphabet ":(ch>='1' && ch<='9')?"It is Number":"It is Special Sysmbol";
     System.out.println(Type);
    
  }
}