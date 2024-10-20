package com.lamdas.learning;

import java.awt.Rectangle;

import javax.swing.Box;

//this is another @ tag we can just write to explicitly mention its a functional interface. 
//this annotation is not mandatory to write.

//lambda expression is inline implementation of functional interface. 
//when to use lambda, simple to remember.
//If we have interface with only one method in it, then we can use lambda.

@FunctionalInterface
abstract interface examplethreeinterface {
	public String getMessage(String passMessage);
}

public class ExampleThree {

	public static void main(String[] args) {

		examplethreeinterface objInterface = (name) -> {
			return "lambda three-----------> " + name;
		};

		String messageString = objInterface.getMessage("hi tester");
		System.out.println(messageString);
	}

}
