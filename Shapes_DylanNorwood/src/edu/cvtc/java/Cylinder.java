/**
 * 
 */
package edu.cvtc.java;

import javax.swing.JOptionPane;

/**
 * @author dylan
 *
 */
public class Cylinder extends Shape {

	// Attributes
	private float radius = 0;
	private float height = 0;
	
	// Constructors
	public Cylinder() {
		// TODO Auto-generated constructor stub
	}

	public Cylinder(float radius, float height) {
		super();
		setRadius(radius);
		setHeight(height);
	}
	

	/**
	 * @return the radius
	 */
	public float getRadius() {
		return radius;
	}


	/**
	 * @param radius the radius to set
	 */
	private void setRadius(float radius) {
		if (radius <=0) {
			throw new IllegalArgumentException("Radius must be a positive value");
		} else {
		this.radius = radius;
		}
	}




	/**
	 * @return the height
	 */
	public float getHeight() {
		return height;
	}




	/**
	 * @param height the height to set
	 */
	private void setHeight(float height) {
		if (height <=0) {
			throw new IllegalArgumentException("Height must be a positive value");
		} else {
		this.height = height;
		}
	}




	@Override
	public float surfaceArea() {
		
		return 2 * (float) Math.PI * this.getRadius() * this.getHeight() + 2 * (float) Math.PI * (float) Math.pow(this.getRadius(), 2);
	}

	/* (non-Javadoc)
	 * @see edu.cvtc.java.Shape#volume()
	 */
	@Override
	public float volume() {
		
		return (float) Math.PI * (float) Math.pow(this.getRadius(), 2) * this.getHeight(); 
	}

	/* (non-Javadoc)
	 * @see edu.cvtc.java.Shape#render()
	 */
	@Override
	public void render() {
		JOptionPane.showMessageDialog(null, "These are the dimensions of the Cylinder...\n "
		+ 	"Radius: " + this.getRadius() 
		+	"\n Height: " + this.getHeight() 
		+ 	"\n Surface Area: " + this.surfaceArea()
		+ 	"\n Volume: " + this.volume());

	}

}
