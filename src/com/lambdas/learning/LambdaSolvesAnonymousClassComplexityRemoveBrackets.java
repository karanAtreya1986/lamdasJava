package com.lambdas.learning;

//same code avoiding anonymous classes and using lamdas directly.
@FunctionalInterface
interface isFunctionalThree {
	void testMethod(String data);
}

public class LambdaSolvesAnonymousClassComplexityRemoveBrackets {

	public static void main(String[] args) {

		// solve using lamda and avoid anonymous classes.
		isFunctionalThree obj = demo -> System.out.println("check with lambda and replace anonymous " + demo);
		;

		// call parameters if any to the interface method
		obj.testMethod(" tiger ");

	}

}
