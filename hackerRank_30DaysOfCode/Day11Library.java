package hackerRank_30DaysOfCode;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.Map;

public class Day11Library {
    Map<String, Book> bookCollection = new HashMap<String, Book>();
    int currentDay = 0;
    int lengthOfCheckoutPeriod = 7;
    double initialLateFee = 0.5;
    double feePerLateDay = 1.0;

    public Day11Library(Map<String, Book> collection){
        this.bookCollection = collection;
    }

    public Day11Library(Map<String, Book> collection,
                        int lengthOfCheckoutPeriod,
                        double initialLateFee,
                        double feePerLateDay){
        this.bookCollection = collection;
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;

    }

    public static void main(String[] args) {

    }

}
