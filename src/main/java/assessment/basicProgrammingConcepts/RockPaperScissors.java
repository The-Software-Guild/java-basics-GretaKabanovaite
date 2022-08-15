package assessment.basicProgrammingConcepts;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        Random randomizer = new Random();

        boolean finished = false;
        while (!finished) {
            try{
                System.out.print("How many rounds would you like to play? ");
                int ties =0;
                int playerWins = 0;
                int computerWins = 0;
                int roundCount = Integer.parseInt(myScanner.nextLine());
                if(roundCount > 10 || roundCount < 1) {
                    throw new NumberFormatException();
                } else {
                    for (int i=0; i<roundCount; i++){
                        System.out.println("Please input 1 for Rock, 2 for Paper, and 3 for Scissors.");
                        int playerInput = Integer.parseInt(myScanner.nextLine());
                        if (playerInput >= 1 && playerInput <=3) {
                            int computerPlay = randomizer.nextInt(3) + 1;

                            if(computerPlay == 1) {
                                System.out.print("I choose Rock! ");
                                if(playerInput == computerPlay) {
                                    System.out.println("It's a tie.");
                                    ties++;
                                } else if (playerInput == 2) {
                                    System.out.println("You win...");
                                    playerWins++;
                                } else {
                                    System.out.println("I win!");
                                    computerWins++;
                                }
                            } else if (computerPlay == 2) {
                                System.out.print("I choose Paper! ");
                                if(playerInput == computerPlay) {
                                    System.out.println("It's a tie.");
                                    ties++;
                                } else if (playerInput == 3) {
                                    System.out.println("You win...");
                                    playerWins++;
                                } else {
                                    System.out.println("I win!");
                                    computerWins++;
                                }
                            } else {
                                System.out.print("I choose Scissors! ");
                                if(playerInput == computerPlay) {
                                    System.out.println("It's a tie.");
                                    ties++;
                                } else if (playerInput == 1) {
                                    System.out.println("You win...");
                                    playerWins++;
                                } else if (playerInput == 2) {
                                    System.out.println("I win!");
                                    computerWins++;
                                }
                            }
                            System.out.println();
                        } else {
                            throw new NumberFormatException();
                        }
                    }
                    System.out.println("There were " + ties + " ties. You won " + playerWins + " times and lost " + computerWins + " times.");
                    if(playerWins > computerWins) {
                        System.out.println("You are the winner. Rematch?");
                    } else if (computerWins > playerWins) {
                        System.out.println("I won! Wanna try again, loser?");
                    } else {
                        System.out.println("It's a tie. Let's try again?");
                    }
                    String rematch = myScanner.nextLine();
                    if(!rematch.equalsIgnoreCase("yes")) {
                        finished = true;
                        System.out.println("Thanks for playing!");
                    }
                }
            } catch (NumberFormatException e) {
                System.err.println("You inputted the wrong values.");
            }
        }
    }
}
