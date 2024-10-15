import java.util.*;
public class Program_112{

//3. Write a C program to print all alphabets from a to z. - using //while loop

    public static void main(String[] args){
       //Scanner sc=new Scanner(System.in);
       //System.out.println("Enter the chracter : ");
       char ch='a';
 
       while(ch>='a' && ch<='z'){
          System.out.print(ch+" ");
          ch++;
       }

    }
}