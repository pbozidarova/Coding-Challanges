package hackerRank_30DaysOfCode;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Day23TicTacToe {

    public static void main(String[] args) {
        //Getting input
        Scanner scanner = new Scanner(System.in);
        //Allows for cont games
        boolean doYouWantToPlay = true;

        while (doYouWantToPlay){
            //Setting up our tokens and AI
            System.out.println("Welcome to Tic Tac Toe! " +
                    "You are about to go against the master of Tic Tac Tow. " +
                    "Are you ready? I hope so!\nBUT FIRST, you must pick what character you want to be and " +
                    "which character I will be."   );
            System.out.println();
            System.out.println("Enter a single character that will represent you on the board: ");
            char playerToken = scanner.next().charAt(0);
            System.out.println("Enter a single character that will represent your opponent on the board: ");
            char opponentToken = scanner.next().charAt(0);

            TicTacToe game = new TicTacToe(playerToken, opponentToken);
            AI ai = new AI();

            //Set up the game
            System.out.println();
            System.out.println("Now we can start the game! To play enter a number and your token shall be put in its place.\n! " +
                    "The numbers go from 1-9, left to right. We shall see who will win this round.");

            TicTacToe.printIndexBoard();
            System.out.println();

            //Let's play!
            while (!game.gameOver().equals("notOver")){
                if(game.currentMarker == game.userMarker){
                    //USER TURN
                    System.out.println("It's your turn! Enter a spot for your token");
                    int spot = scanner.nextInt();

                    while (game.playTurn(spot)){
                        System.out.println("Try again. " + spot + " is invalid." +
                                " This sport is already taken or it is out of range.");
                        spot = scanner.nextInt();
                    }

                    System.out.println("You picked " + spot + "!");
                }else {
                    //AI Turn
                    System.out.println("It is my turn!");
                    int aiSpot = ai.pickSpot(game);
                    game.playTurn(aiSpot);
                    System.out.println("I picked " + aiSpot + "!");
                }

                //Print out new board
                System.out.println();
                game.printBoard();
            }
            System.out.println(game.gameOver());
            System.out.println();
            System.out.println( "Do you want to play again? Enter Y if you do!" +
                    "Enter anything else if you are tired of me!");
            char response = scanner.next().charAt(0);

            doYouWantToPlay = response == 'Y';
            System.out.println();
            System.out.println();

        }
    }
}

class AI {
    public int pickSpot(TicTacToe game) {
        ArrayList<Integer> choices = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            //If the slot is not taken, add it as a choice
            if(game.board[i] == '-'){
                choices.add(i + 1);
            }
        }

        Random random = new Random();
        int choice = choices.get(Math.abs(random.nextInt() % choices.size()));
        return choice;
    }
}

class TicTacToe{

    public static char[] board;
    protected char userMarker;
    protected char aiMarker;
    protected char winner;
    protected char currentMarker;

    public TicTacToe(char playerToken, char aiMarker){
        this.userMarker = playerToken;
        this.aiMarker = aiMarker;
        this.winner = '-';
        this.board = setBoard();
        this.currentMarker = userMarker;
        this.aiMarker = aiMarker;
    }

    public static char[] setBoard(){
        char[] board = new char[9];
        for (int i = 0; i < board.length; i++) {
            board[i] = '-';
        }
        return board;
    }

    public boolean playTurn(int spot){
        boolean isValid = withinRange(spot) && !isSpotTaken(spot);
        if(isValid) {
            board[spot -1] = currentMarker;
            currentMarker = (currentMarker == userMarker) ? aiMarker : userMarker;
        }
        return isValid;
    }

    //check if our spot is in range
    public boolean withinRange(int number){
        return number > 0 && number < board.length + 1;
    }

    //check if the spot is taken
    public boolean isSpotTaken(int number){
        return board[number - 1] != '-';
    }

    public void printBoard(){
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            if(i % 3 == 0 && i !=0){
                System.out.println();
                System.out.println("---".repeat(20));
            }
            System.out.print(" | " + board[i]);
        }
        System.out.println();
    }

    public static void printIndexBoard(){
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            if(i % 3 == 0 && i !=0){
                System.out.println();
                System.out.println("---".repeat(20));
            }
            System.out.println(" | " + i + 1);
        }
        System.out.println();
    }

    public boolean isThereAWinner(){
        boolean diagonalsAndMiddles = rightDi() ||
                leftDi() ||
                middleRow() ||
                secondCol() &&
                board[4] != '-';

        boolean topAndFirst = topRow() ||
                firstCol() &&
                board[0] != '-';

        boolean bottomAndThird = bottomRow() ||
                thirdCol() ||
                board[8] != '-';

        if(diagonalsAndMiddles){
            this.winner = board[4];
        }else if(topAndFirst){
            this.winner = board[0];
        }else if(bottomAndThird){
            this.winner = board[8];
        }
        return diagonalsAndMiddles || topAndFirst || bottomAndThird;
    }

    public boolean topRow(){
        return board[0] == board[1] && board[1] == board[2];
    }

    public boolean middleRow(){
        return board[3] == board[4] && board[4] == board[5];
    }

    public boolean bottomRow(){
        return board[6] == board[7] && board[7] == board[8];
    }

    public boolean firstCol(){
        return board[0] == board[3] && board[3] == board[6];
    }

    public boolean secondCol(){
        return board[1] == board[4] && board[4] == board[7];
    }

    public boolean thirdCol(){
        return  board[2] == board[5] && board[5] == board[8];
    }

    public boolean rightDi(){
        return board[0] == board[4] && board[4] == board[8];
    }

    public boolean leftDi(){
        return board[2] == board[4] && board[4] == board[6];
    }

    public boolean isTheBoardFilled(){
        for (int i = 0; i < board.length; i++){
            if(board[i] == '-'){
                return false;
            }
        }
        return true;
    }

    public String gameOver(){
        boolean didSomeoneWin = isThereAWinner();
        if(didSomeoneWin){
            return "We have a winner! The winner is " + this.winner + "'s";
        }else if(isTheBoardFilled()){
            return "Draw: Game Over";
        }
        return "notOver";
    }
}