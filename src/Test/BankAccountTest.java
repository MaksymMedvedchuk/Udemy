package Test;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.util.Random;
class Game {
    public static void main(String[] args) {

        Game game = new Game();
        // Print menu
        game.printMenu();
        //Check human choice
        int humanChoice = game.receiveHumanChoice();
        //Check if human wants to play
        while (game.humanWantsToPlay(humanChoice)) {
            //Make my choice
            int myChoice = game.makeMyChoice();
            //Resolve winner
            game.resolveWinner(humanChoice, myChoice);

            game.printMenu();
            humanChoice = game.receiveHumanChoice();
        }
        //Say good bye
        game.sayGoodBye();
    }

    private void sayGoodBye() {
    }

    private boolean humanWantsToPlay(int humanChoice) {
        return true;
    }

    private void printMenu() {
        System.out.println("If you want play with me, then choose your option:");
        System.out.println("1. Rock");
        System.out.println("2. Scissors");
        System.out.println("3. Paper");
        System.out.println("0. Quit the game");

    }

    private int receiveHumanChoice() {
        Scanner consoleScanner = new Scanner(System.in);

        int choice = consoleScanner.nextInt();
        //Chek if it correct
        while (choice < 0 || choice > 3) {
            System.out.println("Sorry, I dont't understand you. Try again.");
            choice = consoleScanner.nextInt();
        }
        return choice;
    }

    private boolean manWantsToPlay(int humanChoice) {
        return true;
    }

    private int makeMyChoice() {
        return 1;
    }

    private void resolveWinner(int humanChoice, int myChoice) {
        //check if nobody wins
        if (humanChoice == myChoice) {
            System.out.println("Nobody wins!");
        }
                //check if human wins
        else if (isHumanWins(humanChoice, myChoice)) {
            System.out.println("Ok, you win!");
        }
        //else we are the winner
        else {
            System.out.println("Sorry, but you losse...!");


        }

    }
    private boolean isHumanWins(int humanChoice, int myChoice) {
        return (humanChoice == 3 && myChoice == 1) ||
                (humanChoice == 2 && myChoice == 3) ||
                (humanChoice == 1 && myChoice == 2);

    }
}






















