package hackerRank_30DaysOfCode;

import java.util.Scanner;

public class Day3 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String weird = "Weird";
        String notWeird = "Not Weird";

        if( N % 2 != 0 ){
            System.out.println(weird);
        }else if( N >= 2 && N <= 5){
            System.out.println(notWeird);
        }else if(N >= 6 && N <= 20){
            System.out.println(weird);
        }else if(N > 20){
            System.out.println(notWeird);
        }

        scanner.close();
    }
}
