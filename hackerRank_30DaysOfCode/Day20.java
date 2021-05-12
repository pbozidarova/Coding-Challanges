package hackerRank_30DaysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Day20 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        // Track number of elements swapped during a single array traversal
        int numberOfSwaps = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n -1 ; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a.get(j) > a.get(j + 1)) {
//                    swap(a.get(j), a.get(j + 1));
                    int temp = a.get(j);
                    int index = a.indexOf(temp);

                    int temp2 = a.get(j + 1);
                    int index2 = a.indexOf(temp2);

                    a.set(index, temp2);
                    a.set(index2, temp);

                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }

        System.out.printf("Array is sorted in %d swaps.%n", numberOfSwaps);
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(a.size() -1));

        bufferedReader.close();
    }


}
