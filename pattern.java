public class Pattern{
   public static void main(String[] args){
        int n=1;
       for(int i=1;i<=4;i++){
          for(int j=1;j<=2*i-1;j++)
          {
             if(j%2==0){
                System.out.print("* ");
             }
             else{
                System.out.print(n+" ");
                n++;
             }
          }
         System.out.println();
       }
       
       for(int i=4;i>=1;i--){
           n=2*i-1;
  
          for(int j=1;j<=2*i-1;j++)
          {
             if(j%2==0){
                System.out.print("* ");
             }
             else{
                System.out.print(n+" ");
                
                n++;
             }
          }
          n=n-1;
          System.out.println();
       }

   }
}