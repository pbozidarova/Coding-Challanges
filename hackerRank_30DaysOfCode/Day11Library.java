package hackerRank_30DaysOfCode;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.Map;

public class Day11Library {
    Map<String, Day11Book> bookCollection = new HashMap<String, Day11Book>();
    int currentDay = 0;
    int lengthOfCheckoutPeriod = 7;
    double initialLateFee = 0.5;
    double feePerLateDay = 1.0;

    public Day11Library(Map<String, Day11Book> collection){
        this.bookCollection = collection;
    }

    public Day11Library(Map<String, Day11Book> collection,
                        int lengthOfCheckoutPeriod,
                        double initialLateFee,
                        double feePerLateDay){
        this.bookCollection = collection;
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;

    }

    public Map<String, Day11Book> getBookCollection() {
        return this.bookCollection;
    }

    public Day11Book getBook(String bookTitle){
        return getBookCollection().get(bookTitle);
    }

    public int getCurrentDay() {
        return this.currentDay;
    }

    public int getLengthOfCheckoutPeriod() {
        return this.lengthOfCheckoutPeriod;
    }

    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }

    public double getInitialLateFee() {
        return initialLateFee;
    }

    public void nextDay(){
        currentDay++;
    }

    public void setDay(int day){
        currentDay = day;
    }

    public void checkOutBook(String title){
        Day11Book book = getBook(title);
        if(book.isCheckedOut()){
            sorryBookAlreadyCheckedOut(book);
        }else {
            book.setCheckedOut(true, currentDay);
            System.out.println("You just checked out " + title + ". It is due on day "
            + (getCurrentDay() + getLengthOfCheckoutPeriod()) +".");
        }
    }

    public void returnBook(String title){
        Day11Book book = getBook(title);
        int daysLate = currentDay - book.getDayCheckedOut() + getLengthOfCheckoutPeriod();
        if(daysLate > 0){
            System.out.println("Tou owe the library $"+(getInitialLateFee() + daysLate * getFeePerLateDay())
            + " because your book is " + daysLate + " days overdue.");
        }else{
            System.out.println("Book returned. Thank you!");
        }
        book.setCheckedOut(false, -1);
    }

    public void sorryBookAlreadyCheckedOut(Day11Book book){
        System.out.println("Sorry, " + book.getTitle() + " is already checked out. " +
                "It should be back on day " + (book.getDayCheckedOut() + getLengthOfCheckoutPeriod()));

    }

    public static void main(String[] args) {
        Map<String, Day11Book> bookCollection = new HashMap<String, Day11Book>();

        Day11Book harry = new Day11Book("Harry Potter", 827132, 999999);
        bookCollection.put("Harry Potter", harry);

        Day11Library lib = new Day11Library(bookCollection);
        lib.checkOutBook("Harry Potter");
        lib.nextDay();
        lib.nextDay();
        lib.checkOutBook("Harry Potter");
        lib.setDay(17);
        lib.returnBook("Harry Potter");
        lib.checkOutBook("Harry Potter");
    }

}
