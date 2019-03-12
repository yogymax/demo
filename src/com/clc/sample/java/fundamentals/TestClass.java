package com.clc.sample.java.fundamentals;

/**
 * examples....
 added by other developer...
 added by yogymax...
 *Loading of test class
 *	Static fields ini of TestClass
 *Static block Execution of Testclass
 *			  inside main method of testclass 
 *           
 *       #Class Loading    
 *            static fields ini of GP
 *            static Block execution of GP 
 * 			static fields ini of P
 *            static Block execution of p
 *            static fields ini of Child
 *            static Block execution of Child
 *           
 *          #Object Creation
 *          
 *          	 Instance Fields ini..GP
 *              Instance Block Execution..Gp 
 *              Constructor calling..Gp
 *          	 
 *          	 Instance Fields ini..P
 *              Instance Block Execution..P 
 *              Constructor calling..P    
 *             
 *              Instance Fields ini..Child
 *              Instance Block Execution..Child 
 *              Constructor calling..CHild
 *              
 *              
 *     s --- I -- ORR
 *     s-s
 *    i-i
 *    i-s        
 */

public class TestClass {

	public static void main(String[] args) {
		int j;
		//System.out.println("inside main method....1" + j);
		Child c1 = new Child();
		Child c2 = new Child();
		
		System.out.println(c1.a);
		System.out.println(c2.a);
		c1.m1();

		
	}
	

	int t;
	static int t2;

}

class GrandParent {
	
	int a=10; //4 bytes ...8
	static int b=20; //2
	
	{
		System.out.println("inside instance block of gp!...9");
	}

	static {
		System.out.println("inside static block of gp..3");
	}

	public GrandParent() {
		System.out.println("inside constructor -- gp..10");
	}

	public void m1() {
		System.out.println("inside instnace method...gp"+a);
	}

	static public void m2() {
		System.out.println("inside static method...gp");
	}

}

class Parent  extends GrandParent{
	int c=30;//11
	static int d=40;//4
	
	
	{
		System.out.println("inside instance block of parent!...12");
	}

	static {
		System.out.println("inside static block of parent...5");
	}

	public Parent() {
		System.out.println("inside constructor -- parent..13");
	}

	public void m3() {
		String localVar = "a";
		System.out.println("inside instnace method...parent");
	}

	static public void m4() {
		System.out.println("inside static method...parent");
	}

}

class Child  extends Parent{
	int e=50;//14
	static int f=60; //6
	
	
	{
		System.out.println("inside instance block of child!...15");
	}

	static {
		System.out.println("inside static block of child...7");
	}

	public Child() {
		System.out.println("inside constructor -- child..16");
	}


	public void m5() {
		System.out.println("inside instnace method...child");
	}

	static public void m6() {
		System.out.println("inside static method...child");
	}

}

/**
 * Test case -- requirement -- test fail -- no business logic -- write business
 * logic -- run test case -- not complete business logic -- rerun test case---
 * 
 * 
 * TDD Approach ---
 * 
 * Test Driven Developement ..
 * 
 * SDLC -- requirement Gathering and Analysis Design -- HLD n LLD
 * Coding/Impelementation -- (Unit Test cases/WhiteBoxTesting) Testing
 * Deplotement Support and maintainance
 */
