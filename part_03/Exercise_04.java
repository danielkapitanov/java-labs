package part_03;


import java.util.Random;
import java.util.Scanner;

/**

 Code a "Rock Paper Scissors" Game

 */

public class Exercise_04 {

      public static void main(String[] strings) {

          Random r = new Random();
          int Result = r.nextInt(3-0) + 0;

        // generate a random number >= 0 and <= 3
        // use this as the computer's hand


        Scanner input = new Scanner(System.in);
        System.out.print("Enter 0 for scissor, 1 for rock, 2 for paper: ");
        int playerHand = input.nextInt();

        String compHand = getHand(Result);

        String playHand = getHand(playerHand);

        String winner = determineWinner(Result, playerHand);

        // call getHand(int hand) to determine the computers hand

        // call getHand(int hand) to determine the players hand

        // call determineWinner(int computerHand, int playerHand) to determine who one

        // print out a message to the console stating which hand the computer had, which hand
        // the play had and who won.

          System.out.println("The computer played "+compHand+", you played "+playHand+". "+winner);

    }

    public static String getHand(int hand) {
        switch (hand) {
            case 0:
                return "scissor";
            case 1:
                return "rock";
            case 2:
                return "paper";
            default:
                return "inocrrect entry";
        }
        // use a switch statement to determine each players hand
        // 0 = scissor, 1 = rock, 2 = paper

        // return hand
    }

        public static String determineWinner(int computer, int player) {

        String status = "";

        switch (player) {
            // use conditional ("?") operator
            case 0:
                status = (computer != 1) ? "You won!" : "You didn't win ;)";
                break;
            case 1:
                status = (computer != 2) ? "You won!" : "You didn't win ;)";
                break;
            case 2:
                status = (computer != 0) ? "You won!" : "You didn't win ;)";
            // implement the two remaining cases
        }

        return status;
    }
}