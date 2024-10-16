package com.lambdas.learning;

@FunctionalInterface
interface isFunctional {
	void testMethod(String data);
}

public class LambdaWithAnonymousClasses {

	public static void main(String[] args) {

		// We have used anonymous inner class. In anonymous inner class, you can
		// create object for damn thing including interface, classes, abstract class etc
		// and then it becomes kind of mini-class and then define methods inside it.
		// we created object of interface.
		// method is overridden.
		// perform the normal operation what you want to do inside the method.
		// call the method using the object of interface and pass parameters if any to
		// the overridden method.
		isFunctional obj = new isFunctional() {

			@Override
			public void testMethod(String data) {
				System.out.println("printing the " + data);

			}
		};
		obj.testMethod(" jackie ");
	}

}
