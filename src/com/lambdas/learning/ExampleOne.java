package com.lambdas.learning;

import java.awt.Rectangle;

import javax.swing.Box;

//define an interface.
abstract interface functionalinterfaceexample {
	String methodname(String parameter);
}

public class ExampleOne {

	// lamdas sign is this : ->
	// four brackets in lamda:
	// {} --> braces
	// () - parenthesis
	// [] - Box brackets
	// <> - angle brackets generics

	// functional interface --
	// only one abstract method in it.
	// replaces interfaces in java.

	// see how to use the interface using lambda.
	// first create object of interface and give any name (obj).
	// as this interface has a method which returns string and takes in parameter
	// pass in any variable name (name).
	// then use the actual code, we want to return "lambda check + variable name".
	// using this interface object, we can call its method and pass in the
	// parameters.
	public static void main(String[] args) {
//		String methodreturns=obj.methodname("karan");
//		System.out.println(methodreturns);
		functionalinterfaceexample obj = (name) -> {
			return "lambda check" + name;
		};
		String methodreturns = obj.methodname(" karan");
		System.out.println(methodreturns);
	}

}
