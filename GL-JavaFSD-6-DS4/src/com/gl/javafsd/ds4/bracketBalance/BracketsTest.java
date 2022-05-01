package com.gl.javafsd.ds4.bracketBalance;

public class BracketsTest {

	public static void main(String[] args) {
		
		test("{[()]}");
		test("{}");
		test("M()W");
		test("[<>]");
		test("[<<]");
		test("({[<>]})");
		test("M[MW]W");
		test("M[]");
		test("[<>");
		
	}
	
	private static void test(String brackets) {
		
		BalancedBracketChecker checker = new BalancedBracketChecker(brackets);
		boolean result = checker.check();
		
		if(result) {
			System.out.println("Bracket expression '"+brackets+"' is balanced\n");
		}else {
			System.out.println("Bracket expression '"+brackets+"' is NOT balanced\n");
		}
	}
	
}
