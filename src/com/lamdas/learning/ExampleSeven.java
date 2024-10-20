package com.lamdas.learning;

import java.awt.Rectangle;

import javax.swing.Box;

@FunctionalInterface
abstract interface exampleseveninterface {
	public String getMessage(String passMessage);
}

public class ExampleSeven {

	public static void main(String[] args) {

		exampleseveninterface obj = name -> {
			return "Welcome " + name;
		};
		System.out.println(obj.getMessage(" ali singh "));
	}

}
