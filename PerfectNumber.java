import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println(false);
            return;
        }

        int sum = 0;
        // proper divisors: from 1 to n/2
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }

        System.out.println(sum == n);
    }
}

