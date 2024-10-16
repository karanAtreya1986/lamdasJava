package com.lambdas.learning;

//see how lambda is used
@FunctionalInterface
interface Circle {
	public double getRadius(double radius);
}

public class CircleClassExample {

	public static void main(String[] args) {

		Circle circleArea = r -> Math.PI * r * r;
		Circle circumference = c -> 2 * Math.PI * c;

		CircleClassExample c1 = new CircleClassExample();
		c1.circleOperation(10, circleArea);
		c1.circleOperation(2, circumference);

	}

	public void circleOperation(double radius, Circle c) {
		System.out.println("radius value is " + radius);
		double radiusCircle = c.getRadius(radius);
		System.out.println("after calculation " + radiusCircle);
	}

	// Lambda is nothing but function definition or functions written in one liner.

}
