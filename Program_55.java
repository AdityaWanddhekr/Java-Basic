import java.util.*;
public class Program_55{
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the month : ");
   int month=sc.nextInt();

   String Days=(month==2)?"28 Days or 29 Days":(month%2==0 && (month>=1 && month<=7))?"30 Days":(month%2==0 && (month>=8 && month<=12))?"31 Days":
               (month%2!=0 && (month>=1 && month<=7))?"31 Days":(month%2!=0 && (month>=8 && month<=12))?"30 Days":"Invalid Input";
   System.out.println(Days);

   


 }
} 