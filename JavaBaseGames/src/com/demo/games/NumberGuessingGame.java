package com.demo.games;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("If want to play game then type yes");
		String play=sc.next();
		
		while (play.equals("yes")) {
			Random rand=new Random();
			int randnum=rand.nextInt(100);
			
			int guess=-1;
			int tries=0;
			
			while(guess!=randnum) {
				System.out.println("Guess the number between 1 to 100 : ");
				guess=sc.nextInt();
				tries++;
				
				if(guess==randnum) {
					System.out.println("Awesom! you guessed the number");
					System.out.println("It only took you "+tries+" guesses !");
					System.out.println("Would you like to play again ? Yes or No ");
					play=sc.next().toLowerCase();
				}
				else if (guess>randnum) {
					System.out.println("Your guess is to high. Try Again.....");
				}
				else {
					System.out.println("Your guess is to low. Try again......");
				}
			}
		}
	}

}

