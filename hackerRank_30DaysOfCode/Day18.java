package hackerRank_30DaysOfCode;



import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Day18 {
    LinkedList stack = new LinkedList();
    LinkedList queue = new LinkedList();

    public void pushCharacter(char c){
        this.stack.push(c);
    }

    public char popCharacter(){
        return (char) this.queue.pop();
    }

    public void enqueueCharacter(char c){
        this.queue.add(c);
    }

    public char dequeueCharacter(){
        return (char) this.stack.remove();

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18 p = new Day18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }

}
