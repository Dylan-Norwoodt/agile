/**
 * 
 */
package edu.cvtc.java;



/**
 * @author dylan
 *
 */
public class Cylinder extends Shape implements Renderer{

	// Attributes
	private float radius = 0;
	private float height = 0;
	
	// Constructors
	
	
	

	public Cylinder(Dialog messageBox, float radius, float height) {
		super(messageBox);
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
	this.getMessageBox().show("These are the dimensions of the Cylinder"
						+ "\nThe Radius of the Cylinder is: " +
						this.getRadius() + "\nThe height of the Cylinder is " +
						this.getHeight() + "\nThe Surface Area of the Cylinder is " +
						this.surfaceArea() + "\nThe Volume of the Cylinder is " +
						this.volume(), "");

	}

}
