import java.util.*;

public class CountFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = Math.abs(n);

        if (n == 0) {
            System.out.println(0);
            return;
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        System.out.println(count);
    }
}

