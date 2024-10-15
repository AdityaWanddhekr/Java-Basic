import java.util.*;
public class Program_104{
   public static void main(String[] args){ 
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num=sc.nextInt();
      int temp=num;
      int temp2=num;
      int count0=0,count1=0, count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0;

      while(num>0){
         
         int last=num%10;
         System.out.println("last = "+last);
              temp=num;
              while(temp>0){
             System.out.println(" ");
                   int last2=temp%10; 
                  System.out.println("last2 = "+last2);
                   if(last==last2){
                         if(last2==0){
                            count0++;
                          }
                        else if(last2==1){
                            count1++;
                          }
                         else if(last2==2){
                            count2++;
                          }
                        else if(last2==3){
                            count3++;
                          }
                         else if(last2==4){
                            count4++;
                          }
                        else if(last2==5){
                            count5++;
                          }
                         else if(last2==6){
                            count6++;
                          }
                         else if(last2==7){
                            count7++;
                          }
                        else  if(last2==8){
                            count8++;
                          }
                        else{
                           count9++;
                         }
                         
                    }
                     temp/=10;
                    //System.out.println("temp = "+temp);
               }
           num/=10;
          //System.out.println("num = "+num);
          
         }

        
         System.out.println("0 = "+count0);
         System.out.println("1 = "+count1);
         System.out.println("2 = "+count2);
         System.out.println("3 = "+count3);
         System.out.println("4 = "+count4);
         System.out.println("5 = "+count5);
         System.out.println("6 = "+count6);
         System.out.println("7 = "+count7);
         System.out.println("8 = "+count8);
         System.out.println("9 = "+count9);
 
   }
}