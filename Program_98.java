import java.util.*;
public class Program_98{

/*
  WAP tp enter Indian Classical music notation and print its western music notation.
*/

   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Indian musical notation : ");
      char Indian=sc.nextLine().charAt(0);
     
      switch(Indian){
        
        case 'S' :System.out.println("C");
                  break;
        case 'R' :System.out.println("D");
                  break;
        case 'G' :System.out.println("E");
                  break;
        case 'M' :System.out.println("F");
                  break;
        case 'P' :System.out.println("G");
                  break;
        case 'D' :System.out.println("A");
                  break;
        case 'N' :System.out.println("B");
                  break;
        default :System.out.println("Invalid Notation !...");
                 
      }
   }
}