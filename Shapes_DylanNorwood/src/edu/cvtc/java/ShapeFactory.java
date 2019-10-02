/**
 * 
 */
package edu.cvtc.java;

/**
 * @author dylan
 *
 */
public class ShapeFactory {

	// Attributes 
	private Dialog dialog; 
	
	// Constructor 
	
	public ShapeFactory(Dialog dialog) {
		setDialog(dialog);
	}
	
	private Dialog getDialog() {
		return this.dialog;
	}
	
	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
	public Shape make(ShapeType type) {
		if (type.equals(ShapeType.Cuboid)) {
			return new Cuboid(getDialog(), 5, 5, 5);
		} else if (type.equals(ShapeType.Cylinder)) {
			return new Cylinder(getDialog(), 5, 5);
		} else if (type.equals(ShapeType.Sphere)) {
			return new Sphere(getDialog(), 5);
		} 
		
		return null;
	}
}
