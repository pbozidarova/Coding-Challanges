package hackerRank_30DaysOfCode;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Day26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] returnedDateArray = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int[] dueDateArray = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();


        LocalDate returnedDate = LocalDate.of(
                returnedDateArray[2],
                returnedDateArray[1],
                returnedDateArray[0]);

        LocalDate dueDate = LocalDate.of(
                dueDateArray[2],
                dueDateArray[1],
                dueDateArray[0]);

        long fine = 0;

        if(returnedDate.isAfter(dueDate)){
            if(returnedDate.getYear() == dueDate.getYear()){
                if(returnedDate.getMonthValue() == dueDate.getMonthValue()){
                    fine = 15 * ( returnedDate.getDayOfMonth() - dueDate.getDayOfMonth());
                } else{
                    fine = 500 * ( returnedDate.getMonthValue() - dueDate.getMonthValue());
                }
            }else {
                fine = 10000;
            }

        }

        System.out.println(fine);
    }

}
