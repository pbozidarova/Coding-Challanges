package hackerRank_30DaysOfCode;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class Day1 {
//    Your Day 1: Data Types
public static void main(String[] args) {
    int i = 4;
    double d = 4.0;
    String s = "HackerRank ";

    Scanner scan = new Scanner(System.in);

    /* Declare second integer, double, and String variables. */
    int i2 = Integer.parseInt(scan.nextLine());
    double d2 = Double.parseDouble(scan.nextLine());
    String s2 = scan.nextLine();
    /* Read and save an integer, double, and String to your variables.*/
    // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

    /* Print the sum of both integer variables on a new line. */
    System.out.println(i + i2);
    /* Print the sum of the double variables on a new line. */
    System.out.println(d + d2);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
    System.out.println(s + s2);
    scan.close();
}
}
