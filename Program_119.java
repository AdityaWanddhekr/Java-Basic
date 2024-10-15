

public class Program_119{

//20. Write a C program to print all ASCII character with their values. 

   public static void main(String[] args){

    char alpha ='a';
    char num ='1';
    char sym='!';

    while(alpha>='a' && alpha<='z')
    {
      System.out.println(alpha+ " = "+(int)alpha);
      alpha++;
    }

    while(num>='1' && num<='9')
    {
      System.out.println(num+ " = "+(int)num);
      num++;
    }

    while(sym>='!' && sym<='&')
    {
       System.out.println(sym+ " = "+(int)sym);
      sym++;
    }
    
     
     
     
      
   }
}