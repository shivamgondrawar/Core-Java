package com.bms.servieslmpi;
import com.bms.model.*;
import com.bms.servies.*;

import java.util.Scanner;

public class Bank implements RBI{
	
	
	double amount;
	Account a=new Account();
	
	
	public void createAccount() {
		
		Scanner sc=new Scanner(System.in);
		//Account No.
		System.out.println("Enter Mobile Number as Account Number:- ");
		a.setAccNo(sc.nextLong());
		//Name
		System.out.println("Enter Full Name :-");
		a.setName(sc.next()+sc.nextLine());
		//Mobile No.
		System.out.println("Enter Mobile Number :- ");
		a.setMobNo(sc.nextLong());
		//Aadhar No.
		System.out.println("Enter Aadhar Number :-");
		a.setAdharNo(sc.nextLong());
		//Pan No
		System.out.println("Enter Pan Card Number :-");
		a.setPanNo(sc.next());
		//Gender
		System.out.println("Enter Gender :-");
		a.setGender(sc.next());
		//Age
		System.out.println("Enter Age :-");
		a.setAge(sc.nextByte());	
	}
	
	
	
	public void displayDetails() {
		//Display Details Method
		System.out.println("Account Number : "+a.getAccNo());
		System.out.println("Name           : "+a.getName());
		System.out.println("Mobile Number  : "+a.getMobNo());
		System.out.println("Aadhar Number  : "+a.getAdharNo());
		System.out.println("Pan Number     : "+a.getPanNo());
		System.out.println("Gender         : "+a.getGender());
		System.out.println("Age            : "+a.getAge());
		System.out.println("Balance        : "+amount);
	}
	
	
	
	public void deposite(double depositeAmount) {
		//Deposite Method
		amount=amount+depositeAmount;
		System.out.println("Deposite Amount : "+depositeAmount);
	}
	
	
	
	public void withdrawal(double withdralAmount) {
		//Withdral Method
		if(amount<withdralAmount) {
			System.out.println("insufficient Balance");
		}
		else if(amount>withdralAmount) {
			amount=amount-withdralAmount;
			System.out.println("Withdral Amount : "+withdralAmount);
		}
		else {
			System.out.println("Enter Wrong Amount");
		}
	}
	
	
	public void balanceCheck() {
		//Balcheck Method
		System.out.println("Balance         : "+amount);
	}
}

