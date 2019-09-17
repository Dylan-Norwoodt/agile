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
		Cuboid cuboid = new Cuboid(10, 10, 10);
		Cylinder cylinder = new Cylinder(5, 5);
		Sphere sphere = new Sphere(3);
		
		
		cuboid.render();
		cylinder.render();
		sphere.render();

	}

}
