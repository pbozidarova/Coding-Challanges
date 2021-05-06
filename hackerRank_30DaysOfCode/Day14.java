package hackerRank_30DaysOfCode;

import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] a) {
        this.elements = a;
    }

    public void computeDifference(){
        for (int i = 0; i < this.elements.length - 1; i++) {
            for (int j = 0; j < this.elements.length; j++) {
                int currentDiff = Math.abs(this.elements[i] - this.elements[j]);
                this.maximumDifference = Math.max(currentDiff, this.maximumDifference);
            }
        }
    }
}

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
