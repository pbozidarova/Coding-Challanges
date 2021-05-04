package hackerRank_30DaysOfCode;

import java.util.Scanner;

public class Day11 {
//  Given a 6 x 6 2D Array, A :
//  We define an hourglass in A to be a subset of values with indices falling in this pattern in A's graphical representation:
//  a b c
//    d
//  e f g
//  There are 16 hourglasses in A, and an hourglass sum is the sum of an hourglass' values.
//  Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int maxSum = Integer.MIN_VALUE;
        for (int startRow = 0; startRow < 4; startRow++) {
            for (int startCol = 0; startCol < 4; startCol++) {
                int currentSum = getCurrentSum(arr, startRow, startCol);
                maxSum = Math.max(currentSum, maxSum);
            }
        }


//        for (int j = 0; j < 6; j++) {
//            int currentSum = 0;
//            for (int row = 0; row < 3; row++) {
//                if(row != 1) {
//                    for (int col = 0; col < 3; col++) {
//                        currentSum += arr[row][col + j];
//                    }
//                }else {
//                    currentSum += arr[j + row][row];
//                }
//            }

//        }

        System.out.println(maxSum);
        scanner.close();
    }

    private static int getCurrentSum(int[][] arr, int startRow, int startCol) {
        int currentSum = 0;
        for (int row = startRow, count = 0; row < startRow + 3; row++, count++) {
            if(count != 1){
                for (int col = startCol; col < startCol +3; col++) {
                    currentSum += arr[row][col];
                }
            }else {
                currentSum += arr[row][startCol +1];
            }
        }
        return currentSum;
    }
}
