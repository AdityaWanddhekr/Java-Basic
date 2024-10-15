import java.util.*;
public class Program_156
{

  //1 4 9 16 25 100.
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number : ");
     int num=sc.nextInt();  
     
     for(int i=1;i<=num;i++){
       int j=i*i;
       System.out.print(j+" "); 
     }
  }
}