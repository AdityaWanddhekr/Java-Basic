import java.util.*;
public class Program_187
{
    public static void main(String[] args)
    { 
         int k=1; 
        for(int i=1;i<=5;i++){
            
           for(int j=1;j<=7;j++){
              if(i==1|| j==1 ||i==5 ||j==7){
                  System.out.print("*"+" ");
              }
              else{
                 System.out.print(k+" "); 
                 k++;
              }
           
           }
             k=i;
          System.out.println();
        }
    }
}