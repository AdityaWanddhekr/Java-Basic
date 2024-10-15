import java.util.*;
public class Program_58{

/*Chef is watching TV. The current volume of the TV is XX. Pressing the volume up button of the TV remote increases the volume by 11 while pressing the volume down button    decreases the volume by 11. Chef wants to change the volume from XX to YY. Find the minimum number of button presses required to do so.*/

    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Current Volume of the TV : ");
      int curr=sc.nextInt();
      System.out.println("Press Volume Up or Down of the TV : ");
      int press=sc.nextInt();
          
           if(curr<press){
             curr=press-curr;
             System.out.println("The Up volume by "+curr);
           }
           else{
              curr=curr-press;
              System.out.println("The Down volume by "+curr);
           }
       
       
    }  

}