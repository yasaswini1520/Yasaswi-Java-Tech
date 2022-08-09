package com.hexaware.functionalinterfaceexample2;

public class LambdaExpressionExample2 {
	public static void main(String[] args) {
		// Lambda Expression
		Message m = () -> System.out.println("Quotation method implemented using Lambda Expression");
		m.quotation();
	}
}
