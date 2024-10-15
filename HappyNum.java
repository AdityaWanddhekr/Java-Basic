import java.util.*;

public class HappyNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num = sc.nextInt();

    int range = 1;
    while (range <= num) {
      int nn = range;
      while (nn != 1 && nn != 4) {
        int sum = 0;
        int temp = nn;
        while (temp > 0) {
          int last = temp % 10;
          sum += (last * last);
          temp /= 10;
        }
        nn = sum;
      }

      if (nn == 1) {
        System.out.println(range);
      }
      range++;
    }
  }
}