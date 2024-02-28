package com.demo.atm;

import java.util.Scanner;

public class Service {

	Scanner sc=new Scanner(System.in);
	double Balence=0;
	 
	public void Deposite(){
		System.out.println("Enter Your Deposite Money");
		double d=sc.nextDouble();
		Balence=Balence+d;
		System.out.println("Money Deposite");
	}
	
	public void Withdrow(){
		System.out.println("Enter Your WithDraw Money");
		double d=sc.nextDouble();
		Balence=Balence-d;
		System.out.println("Money Withdrow");
	}
	
	public void balence(){
		System.out.print("Your Balence Money is :" + Balence+"\n");
		
	}

	
}
