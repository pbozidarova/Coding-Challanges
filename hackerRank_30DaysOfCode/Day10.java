package hackerRank_30DaysOfCode;

import java.util.Scanner;

public class Day10 {
//    Given a base- 10 integer, n, convert it to binary (base-2). Then find and print the base- integer denoting the maximum number of consecutive 's in 's binary representation.

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int rem, s = 0, t = 0;

        while(n > 0) {
            rem = n % 2;
            n = n / 2;
            if(rem == 1) {
                s++;
                if(s >= t) t = s;
            }else{
                s = 0;
            }
        }

        System.out.println(t);

        scanner.close();
    }

}
