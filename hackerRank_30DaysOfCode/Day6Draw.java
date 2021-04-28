package hackerRank_30DaysOfCode;

import java.util.Scanner;

public class Day6Draw {
//    Your teacher has given you the task of drawing a staircase structure.
//    Being an expert programmer, you decided to make a program to draw it for you instead.
//    Given the required height, can you print a staircase as shown in the example?
//    Note: The last line has zero spaces before it.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());
        int index = steps +1;

        while(steps > 0){
            for(int i = steps -1; i > 0; i-- ){
                System.out.print(" ");
            }

            for(int i = 0; i < index - steps; i++ ){
                System.out.print("#");
            }
            System.out.println();
            steps--;
        }
    }
}
