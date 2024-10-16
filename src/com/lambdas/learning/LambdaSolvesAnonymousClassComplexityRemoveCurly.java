package com.lambdas.learning;

//same code avoiding anonymous classes and using lamdas directly.
@FunctionalInterface
interface isFunctionalTwo {
	void testMethod(String data);
}

public class LambdaSolvesAnonymousClassComplexityRemoveCurly {

	public static void main(String[] args) {

		// solve using lamda and avoid anonymous classes.
		isFunctionalTwo obj = (demo) -> System.out.println("check with lambda and replace anonymous " + demo);
		;

		// call parameters if any to the interface method
		obj.testMethod(" tiger ");

	}

}
