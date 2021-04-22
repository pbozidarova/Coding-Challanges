package hackerRank;
//There is a large pile of socks that must be paired by color.
// Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class PileOfSocks {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Integer pairs = 0;
        Map<Integer, Integer> socksByColor = new HashMap();
        for(int i = 0; i < n; i++){
            if(socksByColor.containsKey(ar[i])){
                socksByColor.replace(ar[i], socksByColor.get(ar[i]) + 1);
            }else {
                socksByColor.put(ar[i], 1);
            }
        }
        pairs = socksByColor.values().stream().map(v -> v/2).reduce(0, Integer::sum);

        return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

//        sockMerchant(n, ar);
        int result = sockMerchant(n, ar);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }

}
