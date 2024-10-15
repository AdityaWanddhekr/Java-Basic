import java.util.*;
public class Program_62{

/*There is a group of NN friends who wish to enroll in a course together. The course has a maximum capacity of MM students that can register for it. If there are KK other students who have already enrolled in the course, determine if it will still be possible for all the NN friends to do so or not.*/

   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of student want to enroll : ");
       int group=sc.nextInt();
       System.out.println("Maximum Capacity of student for course : ");
       int capacity=sc.nextInt();
       System.out.println("Already enrolled students : ");
       int already=sc.nextInt();
       System.out.println("Output : ");
       if(group>(capacity-already)){
          System.out.println("NO");
       }
       if(group<=(capacity-already)){
          System.out.println("YES");
       }
   }
}