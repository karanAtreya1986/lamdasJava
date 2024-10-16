package com.lambdas.learning;

import java.awt.Rectangle;

import javax.swing.Box;

@FunctionalInterface
abstract interface examplefourinterface {
	public String getMessage(String passMessage);
}

public class ExampleFour {

	public static void main(String[] args) {

		// giving datatype before parameter (name) is optional.
		// compiler knows what type it will be.
		// java trying to be smart as python.
		examplefourinterface objInterface = (String name) -> {
			return "lambda four-----------> " + name;
		};

		String messageString = objInterface.getMessage("hi tester");
		System.out.println(messageString);
	}

}
