public class Pattern_1
{
   public static void main(String[] args)
   {
       int line=5;
       int min=65;
       int max=min+(line-1);
       int x=8;
       for(int i=min;i<=max;i++){
           for(int j=min;j<=i;j++){
               System.out.print((char)j+" ");
           }
           for(int j=1;j<=x;j++){
               System.out.print("  ");
           }
           x-=2;
           for(int j=i;j>=min;j--){
              System.out.print((char)j+" ");
           }
         System.out.println();
       }        
   }
}