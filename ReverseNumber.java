import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean neg = num < 0;
        num = Math.abs(num);

        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }

        if (neg) rev = -rev;
        System.out.println(rev);
    }
}

