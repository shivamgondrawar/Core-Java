package com.demo.calculator;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("**Welcome Caluater**");
		while(true) {
		System.out.println("1.Addition \n"
				+ "2.Substraction\n"
				+ "3.Multiplication\n"
				+ "4.Division \n"
				+ "5.Exist");
		System.out.println("\nEnter Your Choice");
		int x=sc.nextInt();
		
		Service m=new Service();
		if(x==1){m.Add();}
		else if(x==2){m.Sub();}
		else if(x==3){m.Mul();}
		else if(x==4){m.Div();}
		else if(x==5){System.exit(0);}
		else {System.out.println("Please Enter Write Choice \n");}
		
	}
		
	}

}
