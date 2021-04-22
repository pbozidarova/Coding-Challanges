package hackerRank;

//An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly S steps,
//for every step it was noted if it was an uphill, U, or a downhill, D step. Hikes always start and end at sea level,
//and each step up or down represents a 1 unit change in altitude. We define the following terms:
//
//    * A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level
//    and ending with a step down to sea level.
//
//    * A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level
//    and ending with a step up to sea level.

// Sample input
//      8
//      UDDDUDUU

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CountingValleys {
    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int valleys = 0;
        int sum = 0;
//        Map<Character, Integer> hikerPath = new HashMap<>();
//        hikerPath.put('U', 1);
//        hikerPath.put('D', -1);
//
//        for (int i = 0; i < steps; i++) {
//            if(sum == 0 && path.toCharArray()[i] == 'U') valleys++;
//            sum += hikerPath.get(path.toCharArray()[i]);
//        }

        for(char c : path.toCharArray()){
            if(c == 'U') sum++;
            if(c == 'D') sum--;
            if(sum == 0 && c == 'U') ++valleys;

        }

        return valleys;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = CountingValleys.countingValleys(steps, path);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }

}
