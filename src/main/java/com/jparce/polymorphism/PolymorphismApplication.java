package com.jparce.polymorphism;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PolymorphismApplication {

	public static void main(String[] args) {
		SpringApplication.run(PolymorphismApplication.class, args);
		
		Shape shape = new Shape();
		Triangle triangle = new Triangle();
		Square square = new Square();
		
		shape.printShape();
		triangle.printShape();
		square.printSquare();
		
		shape.shapeColor();
		square.shapeColor();
		triangle.shapeColor();
		
		square.area(5, 5);
		triangle.area(5, 2);
	}

}
