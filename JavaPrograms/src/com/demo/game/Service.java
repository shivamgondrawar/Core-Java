package com.demo.game;

import java.util.Scanner;

public class Service {
	
	Scanner sc=new Scanner(System.in);
	int  number=(int)(100*Math.random());
	
	int K=10;
	int i,gess;
	
	public void m1(){
		 for ( i = 0; i < K; i++) {
			 System.out.println("Guess the number:");
	         gess = sc.nextInt();
	         if (number == gess) {
	                System.out.println("Congratulations! . You guessed the number.");
	                break;
	         }
	         else if (number > gess&& i != K - 1){
	                System.out.println("The number is greater than " + gess);     
	         }
	         else if (number < gess && i != K - 1){
	                System.out.println("The number is less than " + gess);     
	            }
	     }
		 if (i == K){
			 System.out.println("You Have Fail Guessing Number");
			 System.out.println( "The number was " + number);
		 }
	}
}
