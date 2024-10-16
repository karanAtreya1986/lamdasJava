package com.lambdas.learning;

abstract interface returnInterface {
	public String getMessage(String passMessage);
}

public class ReturnWithoutCurlyBrackets {

	public static void main(String[] args) {

		//return statement is added but no curly brackets.
		//we get compile time error -- name cannot be resolved to a variable.
//		returnInterface objInterface = (name) -> 
//			return "lambda two-----------> " + name;
//		;
//
//		String messageString = objInterface.getMessage("hi tester");
//		System.out.println(messageString);
	}

}
