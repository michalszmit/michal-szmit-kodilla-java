package com.kodilla.rps;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {

        boolean end = false;
        int currentRound = 1;
        int playerWins = 0;
        int computerWins = 0;
        int ties = 0;

        Scanner name = new Scanner(System.in);
        Scanner round = new Scanner(System.in);
        Scanner move = new Scanner(System.in);
        Scanner nextGame = new Scanner(System.in);

        System.out.println("Please enter player name: ");
        String username = name.nextLine();

        System.out.println("Please enter the number of rounds you wish to play: ");
        int roundCounter = round.nextInt();

        while (!end) {

            ArrayList<String> compMoves = new ArrayList<>();
            compMoves.add(0, "whatever");
            compMoves.add(1, "rock");
            compMoves.add(2, "paper");
            compMoves.add(3, "scissors");
            String computerMove = compMoves.get((new Random().nextInt(3) + 1));

            String playerMove;

            while (true) {
                System.out.println("\nScore: Player wins: " + playerWins + ", Computer wins: " + computerWins + ", Ties: " + ties);
                System.out.println("\nRound: " + currentRound);
                System.out.println("Please enter your move: 1 - rock, 2 - paper, 3 scissors");
                playerMove = move.nextLine();
                if (playerMove.equals("1") || playerMove.equals("2") || playerMove.equals("3")) {
                    break;
                }
                System.out.println(playerMove + " - invalid move. \nPlease enter correct move: 1 - rock, 2 - paper, 3 scissors");
            }

            if (playerMove.equals("1")) {
                playerMove = "rock";
            }
            if (playerMove.equals("2")) {
                playerMove = "paper";
            }
            if (playerMove.equals("3")) {
                playerMove = "scissors";
            }

            System.out.println(username + " played: " + playerMove);
            System.out.println("Computer played: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println(username + " has tied with computer");
                currentRound++;
                ties++;
            }
            if (playerMove.equals("rock") && computerMove.equals("paper")) {
                System.out.println("Sorry " + username + ", computer wins");
                currentRound++;
                computerWins++;
            }
            if (playerMove.equals("rock") && computerMove.equals("scissors")) {
                System.out.println("Congratulations " + username + ", you win");
                currentRound++;
                playerWins++;
            }
            if (playerMove.equals("paper") && computerMove.equals("scissors")) {
                System.out.println("Sorry " + username + ", computer wins");
                currentRound++;
                computerWins++;
            }
            if (playerMove.equals("paper") && computerMove.equals("rock")) {
                System.out.println("Congratulations " + username + ", you win");
                currentRound++;
                playerWins++;
            }
            if (playerMove.equals("scissors") && computerMove.equals("rock")) {
                System.out.println("Sorry " + username + ", computer wins");
                currentRound++;
                computerWins++;
            }
            if (playerMove.equals("scissors") && computerMove.equals("paper")) {
                System.out.println("Congratulations " + username + ", you win");
                currentRound++;
                playerWins++;
            }

            if(currentRound == roundCounter +1) {
                System.out.println("\nGame over");
                System.out.println("Score: Player wins: " + playerWins + ", Computer wins: " + computerWins + ", ties: " + ties);
                if(playerWins > computerWins){
                    System.out.println("\nCongratulations " + username +", you win the game!");
                }
                if(playerWins < computerWins) {
                    System.out.println("\nSorry " + username +", computer wins, better luck next time");
                }
                if(playerWins == computerWins) {
                    System.out.println("\nGood game " + username + ", but you have tied...");
                }

                System.out.println("\nWould you like to play another game? (n - new game, x - end game)");
                String playAgain = nextGame.nextLine();

                if(playAgain.equals("n")) {
                    System.out.println("Please enter the number of rounds you wish to play: ");
                    roundCounter = round.nextInt();
                    currentRound = 1;
                    computerWins =0;
                    playerWins = 0;
                    ties =0;
                }
                if (!playAgain.equals("n")) {
                    end = true;
                }
            }
        }
    }
}
