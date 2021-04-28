package hackerRank_30DaysOfCode;

import java.util.Scanner;

public class Day6 {
//    Given a string, S, of length N that is indexed from 0 to N - 1, print its even-indexed and
//    odd-indexed characters as 2 space-separated strings on a single line.
//    Note: 0 is considered to be an even index.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());

        while (testCases > 0){
            char[] word = scanner.nextLine().toCharArray();
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();

            for (int i = 0; i < word.length; i++) {
                if( i % 2 == 0 ) even.append(word[i]);
                if( i % 2 != 0 ) odd.append(word[i]);
            }

            System.out.println(even.toString() +" "+ odd.toString());
            testCases--;
        }

    }

}
