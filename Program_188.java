import java.util.*;
public class Program_188
{
   public static void main(String[] args)
   {
         int s=65;
         int e=70;
         for(int i=s;i<=e;i++)
         {
           
            for(int j=i;j<=e;j++)
            {
               System.out.print((char)j+" ");
               
            }
           
            for(int j=s;j<=i-1;j++)
            {
               System.out.print((char)j+" ");
              
            }
            
          System.out.println();
         }
    }
}