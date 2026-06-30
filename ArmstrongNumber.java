import java.util.*;

public class ArmstrongNumber {
    private static int digitsCount(int n) {
        n = Math.abs(n);
        if (n == 0) return 1;
        int c = 0;
        while (n > 0) {
            c++;
            n /= 10;
        }
        return c;
    }

    private static long ipow(long base, int exp) {
        long res = 1;
        for (int i = 0; i < exp; i++) res *= base;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int digits = digitsCount(n);
        int temp = Math.abs(n);

        long sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum += ipow(d, digits);
            temp /= 10;
        }

        System.out.println(sum == (long) Math.abs(n));
    }
}

