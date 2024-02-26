package com.bms.main;

import java.util.Scanner;

import com.bms.servieslmpi.*;

public class Test {
	
	public static void main(String[] args) {
		Bank u=new Bank();
		while(true) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("--Select Servies--"+"\n"+
			//Account Creation--1
					"Press 1. for Account Creation"+"\n"+
			//Account Details--2
					"Press 2. For Account Details"+"\n"+
			//Deposite--3
					"Press 3. for Deposite Money"+"\n"+
			//Withdral--4
					"Press 4. for Withdral Money"+"\n"+
			//Balance--5
					"Press 5. for Check Balance"+"\n"+
			//Exit
					"Press 6. for Exit Servies");
			
			int x=sc.nextInt();
				
				if(x==1) {
					//Account Creation
					System.out.println("Enter Details");
					u.createAccount();
					u.displayDetails();System.out.println();
				}
				
				else if(x==2) {
					//Account Detail
					u.displayDetails();
					System.out.println();
				}
				
				else if(x==3) {
					//Deposite
					System.out.println("Enter Deposite Amount");
					u.deposite(sc.nextDouble());
					u.balanceCheck();
					System.out.println();
				}
				
				else if(x==4) {
					//Withdral
					System.out.println("Enter Withdral Amount");
					u.withdrawal(sc.nextDouble());
					u.balanceCheck();
					System.out.println();
				}
				
				else if(x==5) {
					//BalanceChech
					u.balanceCheck();				}
				
				else if(x==6) {
					//Exit
					System.out.println("Exit Servies");
					break;
				}
				
				else {
					System.out.println("Enter Wroung Choice");
				}
			
		}
	}

}
