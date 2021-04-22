package hackerRank;

//Little Bobby loves chocolate. He frequently goes to his favorite store, Penny Auntie, to buy them. They are having a promotion at Penny Auntie. If Bobby saves enough wrappers, he can turn them in for a free chocolate.
//Function Description
//
//        Complete the chocolateFeast function in the editor below.
//
//        chocolateFeast has the following parameter(s):
//
//        int n: Bobby's initial amount of money
//        int c: the cost of a chocolate bar
//        int m: the number of wrappers he can turn in for a free bar

//Returns
//
//        int: the number of chocolates Bobby can eat after taking full advantage of the promotion
//
//        Note: Little Bobby will always turn in his wrappers if he has enough to get a free chocolate.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ChocolateFeast {
    // Complete the chocolateFeast function below.
    static int chocolateFeast(int n, int c, int m) {
        int chocolatesEaten = n / c;
        int wrappers = n / c;
        while (wrappers >= m){
         int freeChocolates = wrappers / m;

         chocolatesEaten += freeChocolates;
         wrappers = wrappers % m + freeChocolates;
        };

        return chocolatesEaten;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] ncm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(ncm[0]);

            int c = Integer.parseInt(ncm[1]);

            int m = Integer.parseInt(ncm[2]);

            int result = chocolateFeast(n, c, m);

            System.out.println(result);
//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

        scanner.close();
    }

}
