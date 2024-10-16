//package com.lambdas.learning;
//
////add more than one method in functional interface.
////we get the below compile time error --
////Invalid '@FunctionalInterface' annotation; isFunctionalFour is not a functional interface
//@FunctionalInterface
//interface isFunctionalFour {
//	void testMethod(String data);
//
//	void testVariables(String message);
//}
//
//public class MoreThanOneFunctionalInterface {
//
//	public static void main(String[] args) {
//
//		// solve using lamda and avoid anonymous classes.
//		isFunctionalFour obj = demo -> System.out.println("check with lambda and replace anonymous " + demo);
//		;
//
//		// call parameters if any to the interface method
//		obj.testMethod(" tiger ");
//
//	}
//
//}
