import java.util.*;
public class Program_60{
    
    /*Ezio can manipulate at most XX number of guards with the apple of Eden.
    Given that there are YY number of guards, predict if he can safely manipulate all of them.*/

   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the most number of guards Ezio can Manipulate : ");
     int guard_can_mani=sc.nextInt();
     System.out.println("Enter the actual number of guards : ");
     int guard=sc.nextInt();
  
     if(guard_can_mani<guard){
        System.out.println("NO"); 
     } 
     else{
        System.out.println("YES"); 
     }
     
   }
}

