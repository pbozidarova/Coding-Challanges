package hackerRank_30DaysOfCode;

import java.util.Scanner;

public class Day5 {
//    Given an integer, n, print its first 10 multiples.
//    Each multiple n x i(where 1 <= i <= 10) should be printed on a new line in the form: n x i = result.
private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        StringBuilder result = new StringBuilder();
        String line = "%d x %d = %d%n";

        for (int i = 1; i <= 10; i++) {
            result.append(String.format(line, n, i, n * i));
        }
        System.out.println(result.toString());
        scanner.close();
    }

}
