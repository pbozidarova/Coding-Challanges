package javaBrains;

public class ReverseInteger {

    public static void main(String[] args) {
        int number = 54321;
        int reversed = 0;

        while ( number > 0 ){
            reversed = reversed * 10 + number % 10;
            number = number / 10;
        }
        System.out.println(reversed);
    }
}
