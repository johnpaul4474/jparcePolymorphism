package com.jparce.polymorphism;

public class Triangle extends Shape {
	public void printShape() {
		System.out.println("Printing Triangle!");
	}
	
	@Override
	public void shapeColor() {
		System.out.println("Triangle color is white!");
	}
	
	public void area(int x, int y) {
		System.out.println("Area of triangle: " + (x*y)/2);
	}
}
