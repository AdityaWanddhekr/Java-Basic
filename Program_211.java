public class Program_211 {
    public static void main(String[] args) {
        int num = -123;
        int rev = 0;
        while (num > 1) {
            int last = num % 10;
            rev = rev * 10 + last;
            num /= 10;
        }
        System.out.println("rev = " + rev);
    }
}
