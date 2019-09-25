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
		Renderer cuboid = new Cuboid(new MessageBox(), 10, 10, 10);
		Renderer cylinder = new Cylinder(new MessageBox(), 5, 5);
		Renderer sphere = new Sphere(new MessageBox(), 3);
		
		
		cuboid.render();
		cylinder.render();
		sphere.render();

	}

}
