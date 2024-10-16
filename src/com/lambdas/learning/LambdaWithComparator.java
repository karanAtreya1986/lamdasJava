package com.lambdas.learning;

@FunctionalInterface
interface mycomparator {
	boolean compareTo(int a1, int a2);
}

public class LambdaWithComparator {

	public static void main(String[] args) {

		mycomparator object = (a4, a5) -> {
			return a4 > a5;
		};
		System.out.println(object.compareTo(5, 7));
	}

}
