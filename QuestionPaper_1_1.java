import java.util.*;
public class QuestionPaper_1_1
{
    public static void main(String[] args)
    {
        /* int i=0, j=1, k=2, m;
           m = i++ ||  j++ || k++;
           System.out.println("m = "+ m);
           System.out.println("i = "+ i);
           System.out.println("j = "+ j);
           System.out.println("k = "+ k);
         */
        
       /* int c = --2; 
         System.out.println("c ="+ c); 
        */

        /*        int x = 25;
                x = x >> -5;
               System.out.println("x = "+ x);
         */

           /*     int y = 1;
                if (y & (y = 2))
                   System.out.println("y = "+ y);
                else
                   System.out.println("y = "+ y);
             */

             int res;
             res = (64 >>(2+1-2)) & (~(1<<2));
              System.out.println("res = "+res);

        
    }
}