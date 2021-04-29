package hackerRank_30DaysOfCode;

import java.util.Arrays;
import java.util.Scanner;

public class Day7 {
//  Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] line = scanner
                .nextLine().split(" ");
        String[] reversedLine = new String[line.length];

        int index = 0;
        while (n-- > 0){
            reversedLine[n] = line[index++];
        }

        System.out.println(String.join(" ", reversedLine));
    }
}
