package com.lamdas.learning;

import java.awt.Rectangle;

import javax.swing.Box;

@FunctionalInterface
abstract interface examplefiveinterface {
	public String getMessage(String passMessage);
}

public class ExampleFive {

	public static void main(String[] args) {

		// no need of brackets around parameter if there is only one.
		// for multiple parameters, we have to give brackets.
//		examplefiveinterface objInterface = name -> {
//			return "lambda four-----------> " + name;
//		};
		
		//if we give more than one word, even if its a datatype, 
		//then it throws compiler error.
		//Syntax error on token "name", delete this token
//		examplefiveinterface objInterface = String name -> {
//			return "lambda four-----------> " + name;
//		};

//		String messageString = objInterface.getMessage("hi tester");
//		System.out.println(messageString);
	}

}
