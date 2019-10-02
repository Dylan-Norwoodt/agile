package edu.cvtc.java.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.cvtc.java.Cuboid;
import edu.cvtc.java.Cylinder;
import edu.cvtc.java.ShapeFactory;
import edu.cvtc.java.ShapeType;
import edu.cvtc.java.Sphere;

public class ShapeFactoryTest {
	
	MessageBoxSub messageBox = new MessageBoxSub();
	ShapeFactory shapeFactory = new ShapeFactory(messageBox);
	
	Cylinder cylinder = (Cylinder) shapeFactory.make(ShapeType.Cylinder);
	
	Cuboid cuboid = (Cuboid) shapeFactory.make(ShapeType.Cuboid);
	
	Sphere sphere = (Sphere) shapeFactory.make(ShapeType.Sphere);

	@Test
	public void testCuboid() {
		assertTrue(cuboid instanceof Cuboid);
	}
	
	@Test
	public void testCylinder() {
		assertTrue(cylinder instanceof Cylinder);
	}
	
	@Test
	public void testSphere() {
		assertTrue(sphere instanceof Sphere);
	}
	

}
