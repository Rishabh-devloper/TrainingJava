package com.deloitte.training.java8;

public interface DemoInterface {
	String name="Deloitee";
	void methodOne();
	default void defaultMethod() {
		System.out.println("Method default implementing");
	}
	static void staticMethod() {
		System.out.println("Method static implemented");
	}
}
