package javaBrains;

//Write a short program that prints each number from 1 to 100 on a new line.
//For each multiple of 3, print "Fizz" instead of the number.
//For each multiple of 5, print "Buzz" instead of the number.
//For number which are multiples of both 3 and 5 print FizzBuzz instead of the number.

public class FizzBuzz {

    public static void main(String[] args) {

        System.out.println(buildFizzBuzz(100));
    }

    public static String buildFizzBuzz(int n){
        StringBuilder result = new StringBuilder();

        for(int i = 1; i <= n; i++) {
            if( i % 3 == 0) result.append("Fizz");
            if( i % 5 == 0) result.append("Buzz");
            if(i % 3 != 0 && i % 5 != 0 ) result.append(i);

            result.append(System.lineSeparator());
        }

        return result.toString();
    }

}
