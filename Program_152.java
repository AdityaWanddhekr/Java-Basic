import java.util.*;
public class Program_152
{

     //1 5 25 125 625.
     public static void main(String[] args) 
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        int j=1;
        for(int i=1;i<=num;i++){
           System.out.print(j+" ");
           j=j*5;
        }
     }
}