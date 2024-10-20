package com.lamdas.learning;

//see how lambda is used
@FunctionalInterface
interface CircleTwo {
	public double getRadius(double radius);
}

public class CircleClassExampleTwo {

	public static void main(String[] args) {

		CircleTwo circleArea = r -> Math.PI * r * r;
		CircleTwo circumference = c -> 2 * Math.PI * c;

		CircleClassExampleTwo c1 = new CircleClassExampleTwo();
		double circleAreaIs = c1.circleOperation(10, circleArea);
		double circleCircumferenceIs = c1.circleOperation(2, circumference);
		System.out.println("area is " + circleAreaIs);
		System.out.println("circumference is " + circleCircumferenceIs);

	}

	public double circleOperation(double radius, CircleTwo c) {
		double radiusCircle = c.getRadius(radius);
		return radiusCircle;
	}

	// Lambda is nothing but function definition or functions written in one liner.

}
