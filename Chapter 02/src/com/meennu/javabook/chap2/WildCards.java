package com.meennu.javabook.chap2;

import java.util.Collection;
import java.util.List;

public class WildCards {

	public static void printElements(Collection<?> anyCollection) {
		for (Object theObject : anyCollection) {
			System.out.println(theObject);
		}
	}

	public static void drawShapes(List<? extends Shape> shapesList) {
		for (Shape eachShape : shapesList) {
			eachShape.drawShape();
		}
	}

	public static void addCircles(List<? super Circle> circles) {
		circles.add(new Circle());
		// circles.add(new Shape());
	}

}

class Shape {

	public void drawShape() {
	}
}

class Circle extends Shape {

}
