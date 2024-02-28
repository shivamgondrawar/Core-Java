package com.demo.calculator;

import java.util.Scanner;

public class Service {

	Scanner sc=new Scanner(System.in);
	
    public void Add(){
    	System.out.println("Enter Number");
    	int x=sc.nextInt();
    	
    	System.out.println("Enter Number");
    	int y=sc.nextInt();
    	
    	System.out.println("Addition : "+(x+y)+"\n");	
    }
    
    public void Sub(){
    	System.out.println("Enter Number");
    	int x=sc.nextInt();
    	
    	System.out.println("Enter Number");
    	int y=sc.nextInt();
    	
    	System.out.println("Substraction : "+(x-y)+"\n");	
    }
    
    public void Mul(){
    	System.out.println("Enter Number");
    	int x=sc.nextInt();
    	
    	System.out.println("Enter Number");
    	int y=sc.nextInt();
    	
    	System.out.println("Multiplication : "+(x*y)+"\n");	
    }
    
    public void Div(){
    	System.out.println("Enter Number");
    	int x=sc.nextInt();
    	
    	System.out.println("Enter Number");
    	int y=sc.nextInt();
    	
    	System.out.println("Division : "+(x/y)+"\n");
    }
   
}
