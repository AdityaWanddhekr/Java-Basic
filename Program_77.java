import java.util.*;
public class Program_77{
// WAP to find the triangle is equilateral, isosclaen,or scalen.
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int s1=sc.nextInt();
      System.out.println("Enter the number : ");
      int s2=sc.nextInt();
      System.out.println("Enter the number : ");
      int s3=sc.nextInt();
 
      if((s1==s2)&&(s2==s3)&&(s3==s1)){
        System.out.println("The Trangle is Equilateral !...");
      }
     else if(s1==s2 || s2==s3 ||s3==s1){
        System.out.println("The  Trangle is Isoscalen !...");
      }
     else{
        System.out.println("The  Trangle is Scalen!...");
      }

  }	
}
