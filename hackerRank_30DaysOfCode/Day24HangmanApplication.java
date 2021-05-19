package hackerRank_30DaysOfCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Day24HangmanApplication {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Hangman game = new Hangman();

        System.out.println("Welcome to hangman! I will pick a word and you will try to guess it! " +
                "If you guess wrong 6 times, then I win. If you can guess it before then you win. " +
                "Are you ready? I hope so, because I am!");
        System.out.println();
        System.out.println("I have picked my word below. Below is a picture, and below that is your current guess " +
                "which starts off as nothing. Every time you guess incorrectly, I add a body part to the picture. " +
                "When there is a full person, you lose.");

        boolean doYouWantToPlay = true;
        while (doYouWantToPlay){
            //keep playing
            System.out.println();
            while(!game.gameOver()){
                //Playing the game
            }

            System.out.println();
            System.out.println("Do you want to play another game? " +
                    "Enter Y if you do.");

            Character response = scanner.next().toUpperCase().charAt(0);
            doYouWantToPlay = response == 'Y';
        }
    }
}

class Hangman{
    String mysteryWord;
    StringBuilder currentGuess;
    ArrayList<Character> previousGuesses = new ArrayList<>();

    int maxTries = 6;
    int currentTry = 0;

    ArrayList<String> dictionary = new ArrayList<>();
    private static FileReader fileReader;
    private static BufferedReader bufferedFileReader;

    public Hangman() throws IOException {
        initializeStreams();
        mysteryWord = pickWord();
        currentGuess = initializeCurrentGuess();
    }

    private StringBuilder initializeCurrentGuess() {
        StringBuilder current = new StringBuilder();
        for (int i = 0; i < mysteryWord.length() * 2; i++) {
            if(i % 2 == 0){
                current.append("_");
            }else {
                current.append(" ");
            }
        }

        return current;
    }

    private String pickWord() {
        Random rand = new Random();
        int wordIndex = Math.abs(rand.nextInt()) % dictionary.size();

        return dictionary.get(wordIndex);
    }

    private void initializeStreams() {
        this.dictionary.addAll(
                Arrays.asList(new String[]{"one", "two", "three", "four", "five", "siz", "seven", "eight", "nine", "ten"}));
    }

    public String drawPicture(){
        switch (currentTry){
            case 0: return noPersonDraw();
            case 1: return addHeadDraw();
            case 2: return addBodyDraw();
            case 3: return addOneArmDraw();
            case 4: return addSecondArmDraw();
            case 5: return addFirstLegDraw();
            case 6: return addSecondLegDraw();
            default: return fullPersonDraw();
        }
    }

    private String addSecondLegDraw() {
        return " - - - - -\n"+
                "|        |\n"+
                "|        O\n" +
                "|      / | \\ \n"+
                "|        |\n" +
                "|       / \\ \n" +
                "|\n" +
                "|\n";
    }

    private String addFirstLegDraw() {
        return " - - - - -\n"+
                "|        |\n"+
                "|        O\n" +
                "|      / | \\ \n"+
                "|        |\n" +
                "|       / \n" +
                "|\n" +
                "|\n";
    }

    private String fullPersonDraw() {
        return " - - - - -\n"+
                "|        |\n"+
                "|        O\n" +
                "|      / | \\ \n"+
                "|        |\n" +
                "|       / \\ \n" +
                "|\n" +
                "|\n";
    }

    private String addSecondArmDraw() {
        return " - - - - -\n"+
                "|        |\n"+
                "|        O\n" +
                "|      / | \\ \n"+
                "|        |\n" +
                "|         \n" +
                "|\n" +
                "|\n";;
    }

    private String addOneArmDraw() {
        return " - - - - -\n"+
                "|        |\n"+
                "|        O\n" +
                "|      / |  \n"+
                "|        |\n" +
                "|       \n" +
                "|\n" +
                "|\n";;
    }

    private String addBodyDraw() {
        return " - - - - -\n"+
                "|        |\n"+
                "|        O\n" +
                "|        |\n"+
                "|        |\n" +
                "|         \n" +
                "|\n" +
                "|\n";
    }

    private String addHeadDraw() {
        return " - - - - -\n"+
                "|        |\n"+
                "|        O\n" +
                "|        \n"+
                "|        \n" +
                "|        \n" +
                "|\n" +
                "|\n";
    }

    private String noPersonDraw() {

        return " - - - - -\n"+
                "|        \n"+
                "|        \n" +
                "|        \n"+
                "|        \n" +
                "|        \n" +
                "|\n" +
                "|\n";
    }

    public boolean gameOver(){
        return true;
    }


}
