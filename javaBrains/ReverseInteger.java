package javaBrains;

public class ReverseInteger {

    public static void main(String[] args) {
        int number = 54321;

        System.out.println(reverse(number));
    }

    private static int reverse(int number){
        int reversed = 0;
        while ( number > 0 ){
            reversed = reversed * 10 + number % 10;
            number /= 10;
            if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
                return 0;
            }
        }
        return reversed;
    }
}
