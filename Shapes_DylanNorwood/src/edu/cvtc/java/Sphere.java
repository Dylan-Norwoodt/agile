/**
 * 
 */
package edu.cvtc.java;

import java.lang.Math;

import javax.swing.JOptionPane;
/**
 * @author dylan
 *
 */
public class Sphere extends Shape {

	// Attributes
	private float radius = 0;
	
	// Constructors 
	public Sphere() {
		// TODO Auto-generated constructor stub
	}

	public Sphere(float radius) {
		super();
		setRadius(radius);
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
			throw new IllegalArgumentException("Radius needs to be a positive value");
		} else {
		this.radius = radius;
		}
	}



	@Override
	public float surfaceArea() {
		return (float) (4 * (Math.PI) * Math.pow(this.getRadius(), 2));
		
	}

	/* (non-Javadoc)
	 * @see edu.cvtc.java.Shape#volume()
	 */
	@Override
	public float volume() {
		// TODO Auto-generated method stub
		return (4 * (float) Math.pow(this.getRadius(), 3) * (float) Math.PI) / 3;
	}

	/* (non-Javadoc)
	 * @see edu.cvtc.java.Shape#render()
	 */
	@Override
	public void render() {
		JOptionPane.showMessageDialog(null, "These are the dimensions of the Sphere...\n "
		+ 	" Radius: " + this.getRadius() 
		+ 	"\n Surface Area: " + this.surfaceArea()
		+ 	"\n Volume: " + this.volume());

	}

}
