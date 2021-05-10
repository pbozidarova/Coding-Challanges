package hackerRank;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

//Calculate the hourglass sum for every hourglass in arr, then print the maximum hourglass sum.
// The array will always be 6 x 6
//1 1 1 0 0 0
//0 1 0 0 0 0
//1 1 1 0 0 0
//0 0 2 4 4 0
//0 0 0 2 0 0
//0 0 1 2 4 0
//Max sum is 19

public class Hourglass {

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int maxSum = Integer.MIN_VALUE;
        for (int startRow = 0; startRow < 4; startRow++) {
            for (int startCol = 0; startCol < 4; startCol++) {
                int currentSum = getCurrentSum(arr, startRow, startCol);
                maxSum = Math.max(currentSum, maxSum);
            }
        }

        return maxSum;
    }

    private static int getCurrentSum(List<List<Integer>> arr, int startRow, int startCol) {
        int currentSum = 0;
        int count = 0;

        for (int row = startRow; row < startRow +3; row++) {
            if(count != 1){
                for (int col = startCol; col < startCol +3; col++) {
                    currentSum += arr.get(row).get(col);
                }
            }else {
                currentSum += arr.get(row).get(startCol +1);
            }
            count++;
        }

        return currentSum;
    }


}
class Day18 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Hourglass.hourglassSum(arr);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
