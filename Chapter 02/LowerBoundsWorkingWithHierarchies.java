package com.meennu.javabook.chap2;

import java.util.*;

abstract class AnyShape {
	abstract void drawShape();
}

class CircleShape extends AnyShape {
	@Override
	void drawShape() {
		System.out.println("Drawing a Circle");
	}
}

class RectangleShape extends AnyShape {
	@Override
	void drawShape() {
		System.out.println("Drawing a Rectangle");
	}
}

public class LowerBoundsWorkingWithHierarchies {
	public static void drawShapes(List<? super CircleShape> shapes) {
		shapes.add(new CircleShape());
		// shapes.add(new Shape());
		// shapes.add(new Rectangle());

		for (Object shape : shapes) {
			System.out.println("Processing shape: " + shape.getClass().getSimpleName());
		}
	}

	public static void main(String[] args) {
		List<AnyShape> shapeList = new ArrayList<>();
		drawShapes(shapeList);

		System.out.println("Final list: " + shapeList);
	}
}
