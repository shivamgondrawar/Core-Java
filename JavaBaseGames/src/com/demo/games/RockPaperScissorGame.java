package com.demo.games;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String[] availableMoves= {"Rock","Paper","Scissors"};
			// using Random() function on indices of array so that it chooses a random move.
			String computerMove=availableMoves[new Random().nextInt(availableMoves.length)];
			System.out.println("Computer has chosen it's move.\n");
			System.out.println("Now it's your turn to choose. \nGood Luck!\n");
			//2.Player Move
			//input
			String userMove;
			//loop until the user choose the correct move
			while (true) {
				System.out.println("Please choose your from these available moves : 'rock' 'paper' 'scissors' ");
				System.out.println("Enter the move you chose : ");
				userMove = sc.nextLine().toLowerCase();
				// checking if user's move is one of the available moves or not
				if(userMove.equals("rock") || userMove.equals("paper") || userMove.equals("scissors")){
					System.out.println();
					break;//this break - break in side while loop
				}
				// if user didn't enter a valid input
				System.out.println();
				System.out.println("Invalid Move!!");
				System.out.println("Please enter the move from the available moves only!");
				System.out.println();
			}
			//Printing what computer choose
			System.out.println("Computer Choose : "+computerMove);
			//3.Compare the moves & deciding the winner
			//checking for a tie
			if(userMove.equals(computerMove)) {
				System.out.println("It's a tie!...");
			}
			//checking for all other moves possible
			else if (userMove.equals("rock")) {
				if(computerMove.equals("paper")) {
					System.out.println("Computer Won!!!");
					System.out.println("Better luck next time!");
				}
				else if (computerMove.equals("scissors")) {
					System.out.println("You won!!!");
					System.out.println("Congratulations!");
				}
			}
			else if (userMove.equals("paper")) {
				if(computerMove.equals("rock")) {
					System.out.println("Computer Won!!!");
					System.out.println("Better luck next time!");
				}
				else if (computerMove.equals("scissors")) {
					System.out.println("You won!!!");
					System.out.println("Congratulations!");
				}
			}
			else if (userMove.equals("scissors")) {
				if(computerMove.equals("paper")) {
					System.out.println("Computer Won!!!");
					System.out.println("Better luck next time!");
				}
				else if (computerMove.equals("rock")) {
					System.out.println("You won!!!");
					System.out.println("Congratulations!");
				}
			}
			
			System.out.println();
			String playAgain;
			System.out.println("Do you want to play again? ");
			
			// loop until the user chooses the correct option
			while(true) {
				
				System.out.println("Type 'yes' or 'no' ");
				playAgain = sc.nextLine().toLowerCase();
				
				if(playAgain.equals("yes")||playAgain.equals("no")) {
					System.out.println();
					System.out.println("===========\nGame End!!!\n===========");
					System.out.println();
					break;
				}
				System.out.println();
				System.out.println("Invalid Input");
				System.out.println();
			}
			
			if(playAgain.equals("no") || playAgain.equals("No")) {
				break;
			}
			
		}
	}

}

