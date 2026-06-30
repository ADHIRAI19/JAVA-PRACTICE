import java.util.*;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        num = Math.abs(num);
        int max = 0;
        if (num == 0) {
            max = 0;
        } else {
            while (num > 0) {
                int d = num % 10;
                if (d > max) max = d;
                num /= 10;
            }
        }
        System.out.println(max);
    }
}

