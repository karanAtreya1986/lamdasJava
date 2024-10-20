package com.lamdas.learning;

//same code avoiding anonymous classes and using lamdas directly.
//lambda eliminates anonymous class totally.
@FunctionalInterface
interface isNewFunctional {
	void testMethod(String data);
}

public class LambdaSolvesAnonymousClassComplexity {

	public static void main(String[] args) {

		// solve using lamda and avoid anonymous classes.
		isNewFunctional obj = (demo) -> {
			System.out.println("check with lambda and replace anonymous " + demo);
		};

		// call parameters if any to the interface method
		obj.testMethod(" tiger ");

	}

}
