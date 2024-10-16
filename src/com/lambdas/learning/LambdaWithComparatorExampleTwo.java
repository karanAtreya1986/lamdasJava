package com.lambdas.learning;

@FunctionalInterface
interface mycomparatorOne {
	boolean compareTo(int a1, int a2);
}

public class LambdaWithComparatorExampleTwo {

	public static void main(String[] args) {

		mycomparatorOne object = (a4, a5) -> {
			return a4 > a5;
		};
		boolean b1 = object.compareTo(5, 7);
		System.out.println(b1);

	}

}
