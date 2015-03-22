package com.patterns.abstractFactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shape) {
		if(shape==null)
			return null;
		if(shape.equalsIgnoreCase("CIRCLE"))
			return new Circle();
		else if (shape.equalsIgnoreCase("TRIANGLE"))
			return new Triangle();
		else if (shape.equalsIgnoreCase("RECTANGLE"))
			return new Rectangle();
		return null;
			
	}

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
