package com.lamdas.learning;

import java.awt.Rectangle;

import javax.swing.Box;

@FunctionalInterface
abstract interface examplesixinterface {
	public void getMessage(String passMessage);
}

public class ExampleSix {

	public static void main(String[] args) {

		// curly brackets are also optional only if we using sysout statements
		// or normal operations.
		// if we are using return keyword, then it becomes mandatory.
		// it throws compiler error -- name cannot be resolved to a variable,
		// if we dont use curly when we use return statements.
//		examplesixinterface objInterface = name -> 
//			return "lambda four-----------> " + name;

		// since function inside interface returns string, we cannot return void
		// or use sysout.
		// compiler error -- Cannot return a void result is thrown.
//		examplesixinterface objInterface = name -> System.out.println("hello" + name);
		examplesixinterface objInterface = name -> System.out.println("hello" + name);

//		String messageString = objInterface.getMessage("hi tester");
//		System.out.println(messageString);
		objInterface.getMessage(" karan ");
	}

}
