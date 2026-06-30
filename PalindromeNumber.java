import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean neg = num < 0;
        num = Math.abs(num);

        int original = num;
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }

        boolean isPal = (rev == original) && !neg;
        // If you want negative numbers treated differently, remove the !neg part.
        System.out.println(isPal);
    }
}

