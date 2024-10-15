import java.util.*;
public class Program_185
{
    public static void main(String[] args)
    {
         int x=1;
        for(int i=1;i<=4;i++)
        {
           for(int j=1;j<=i;j++)
           {
              System.out.print(x);
              if(j<i)
              {
                 System.out.print("*");
              }
             x++;
           }
          System.out.println();
        }
            
         for(int i=4;i>=1;i--)
        {
            x=x-1;
           for(int j=1;j<=i;j++)
           {
              System.out.print(x);
              if(j<i)
              {
                 System.out.print("*");
              }
              x-=(2*i)-1;
           }
          System.out.println();
        }
    }
}