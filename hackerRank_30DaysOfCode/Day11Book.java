package hackerRank_30DaysOfCode;

public class Day11Book {
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut; //whether or not the book is checked out
    int dayCheckedOut = -1;

    //
    public Day11Book(String bookTitle, int bookPageCount, int bookISBN) {
        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.ISBN = bookISBN;
        this.isCheckedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut, int currentDayCheckedOut) {
        isCheckedOut = checkedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }

    public int getDayCheckedOut() {
        return dayCheckedOut;
    }

    private void setDayCheckedOut(int day) {
        this.dayCheckedOut = day;
    }
}
