import java.util.*;
public class Program_105{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the any digit number : ");
      int num=sc.nextInt();
      int count0=0,count1=0, count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0;

     

      while(num>0){
          int rem=num%10;
          if(rem==0){
            count0++;
          }
           if(rem==1){
            count1++;
          }
          if(rem==2){
            count2++;
          }
           if(rem==3){
            count3++;
          }
           if(rem==4){
            count4++;
          }
           if(rem==5){
            count5++;
          }
           if(rem==6){
            count6++;
          }
           if(rem==7){
            count7++;
          }
           if(rem==8){
            count8++;
          }
          if(rem==9){
            count9++;
          }
       num=num/10;
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