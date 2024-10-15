import java.util.*;
public class Program_162
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
      
       int count=0;
       for(int j=1;j>=1;j++)
       {
          int sum =0;
          for(int i=1;i<j;i++)
           {
              if(j%i==0)
              {
                sum+=i;
             
              }
           }
        
        if(sum==j)
        {
           System.out.print(j+" ");
            count++;
        }
      
        if(count==num){
            break;
        }
      }
    }
}