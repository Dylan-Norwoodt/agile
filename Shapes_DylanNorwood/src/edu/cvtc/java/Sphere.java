/**
 * 
 */
package edu.cvtc.java;

import java.lang.Math;


/**
 * @author dylan
 *
 */
public class Sphere extends Shape implements Renderer{

	// Attributes
	private float radius = 0;
	
	// Constructors 
	public Sphere() {
		
	}

	public Sphere(Dialog messageBox, float radius) {
		super(messageBox);
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
		this.getMessageBox().show( "These are the dimensions of the Sphere...\n"
		+ 	" Radius: " + this.getRadius() 
		+ 	"\nSurface Area: " + this.surfaceArea()
		+ 	"\nVolume: " + this.volume(), null);

	}

	

}
