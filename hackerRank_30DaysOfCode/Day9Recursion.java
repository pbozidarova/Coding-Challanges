package hackerRank_30DaysOfCode;

public class Day9Recursion {

    public static int summation(int n){
        //Base case
        if(n <= 0){
            return 0; //additive identity property
        }else {
            //Recursive case
            return n + summation(n-1);
        }
    }

    public static int factorial(int n){
        //Base case
        if(n <= 1){ //mult identity
            return 1;
        }else {
            //Recursive case
            return n * factorial(n-1);
        }
    }

    public static int exponentiation(int n, int p){
        //Base case
        if(p <= 0){ //mult identity
            return 1;
        }else {
            //Recursive case
            return n * exponentiation(n, p -1);
        }
    }

    public static void main(String[] args) {
        System.out.println(summation(3));
        System.out.println(factorial(8));
        System.out.println(exponentiation(5, 3));
    }
}
