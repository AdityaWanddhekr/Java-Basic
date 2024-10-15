import java.util.*;
public class Program_191
{
   public static void main(String[] args)
   {
       
       for(int i=1;i<5;i++)
       {
            int k=1;
           for(int j=1;j<=(2*i)-1;j++)
           {
              if(i==1|| j==1 || j==(2*i)-1)
              {
                  System.out.print("*");
              }
              else
              {
                System.out.print(k);
                k++;
              
              }
           }
         System.out.println();
       }

       for(int i=5;i>=1;i--)
       {
            int k=1;
           for(int j=1;j<=(2*i)-1;j++)
           {
              if(i==1|| j==1 || j==(2*i)-1)
              {
                  System.out.print("*");
              }
              else
              {
                System.out.print(k);
                
                k++;

                  
              
              }
           }
         System.out.println();
       }
   }
}