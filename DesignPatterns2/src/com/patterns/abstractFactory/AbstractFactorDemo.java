package com.patterns.abstractFactory;

public class AbstractFactorDemo {

	public static void main(String[] args)
	{
		AbstractFactory absFactoryShape = FactoryProducer.getFactory("SHAPE");
		AbstractFactory absFactoryColor = FactoryProducer.getFactory("COLOR");
		Shape shape1 = absFactoryShape.getShape("CIRCLE");
		shape1.draw();
		Color col = absFactoryColor.getColor("RED");
		col.fillColor();
	}
}
