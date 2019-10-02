/**
 * 
 */
package edu.cvtc.java;

/**
 * @author dylan
 *
 */
public class ShapesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dialog messageBox = new MessageBox();
		ShapeFactory shapeFactory = new ShapeFactory(messageBox);
		
		Cylinder cylinder = (Cylinder) shapeFactory.make(ShapeType.Cylinder);
		
		Cuboid cuboid = (Cuboid) shapeFactory.make(ShapeType.Cuboid);
		
		Sphere sphere = (Sphere) shapeFactory.make(ShapeType.Sphere);
		
		cylinder.render();
		cuboid.render();
		sphere.render();
	}

}
