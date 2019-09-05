/**
 * 
 */
package edu.cvtc.java;

import javax.swing.JOptionPane;
/**
 * @author dylan
 *
 */
public class Cuboid extends Shape {

	// Fields
	private float width = 0;
	private float height = 0; 
	private float depth = 0;
	
	// Constructors
	public Cuboid() {
		// TODO Auto-generated constructor stub
	}
	
	public Cuboid(float width, float height, float depth) {
		super();
		setWidth(width);
		setHeight(height);
		setDepth(depth);
		
	}

	
	
	/**
	 * @return the width
	 */
	public float getWidth() {
		return width;
	}



	/**
	 * @param width the width to set
	 */
	private void setWidth(float width) {
		if (width <=0) {
			throw new IllegalArgumentException("Width must be a positive value");
		} else {
		this.width = width;
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



	/**
	 * @return the depth
	 */
	public float getDepth() {
		return depth;
	}



	/**
	 * @param depth the depth to set
	 */
	private void setDepth(float depth) {
		if (depth <=0) {
			throw new IllegalArgumentException("Depth must be a positive value");
		} else {
		this.depth = depth;
		}
	}



	@Override
	public float surfaceArea() {
		// TODO Auto-generated method stub
		return 2 *(this.getHeight() * this.getWidth() + this.getHeight() * this.getDepth() + this.getWidth() * this.getDepth());
	}

	/* (non-Javadoc)
	 * @see edu.cvtc.java.Shape#volume()
	 */
	@Override
	public float volume() {
		
		return this.getDepth() * this.getHeight() * this.getWidth();
	}

	/* (non-Javadoc)
	 * @see edu.cvtc.java.Shape#render()
	 */
	@Override
	public void render() {
		JOptionPane.showMessageDialog(null, "These are the dimensions of the Cuboid...\n Depth: " + this.getDepth() 
										+	"\n Height: " + this.getHeight()
										+	"\n Width: " + this.getWidth() 
										+ 	"\n Surface Area: " + this.surfaceArea()
										+ 	"\n Volume: " + this.volume());

	}

}
