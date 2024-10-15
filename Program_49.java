public class Program_49{
  public static void main(String[] args){
     int a=5;
     int b=6;
     int c=7;
     boolean d=a>b && (++b)>c;
     System.out.println(d);
     System.out.println("a = "+a+"\n b = "+b+"\n c = "+c+"d = "+d);
     
  }
}