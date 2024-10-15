import java.util.*;
// Write a program enter tempreture in farnaite and convert to celcius.
 public class Program_9{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the ");
      float temp=sc.nextFloat();
      float celcius=(temp-32)*5/9;
      System.out.println("The tempreture in celcius is : "+celcius);
    }
 }