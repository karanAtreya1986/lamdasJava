package com.lamdas.learning;

import java.awt.Rectangle;

import javax.swing.Box;

//define an interface.
//here we give public to the method inside interface.
abstract interface newInterface {
	public String getMessage(String passMessage);
}

public class ExampleTwo {

	public static void main(String[] args) {

		newInterface objInterface = (name) -> {
			return "lambda two-----------> " + name;
		};

		String messageString = objInterface.getMessage("hi tester");
		System.out.println(messageString);
	}

}
