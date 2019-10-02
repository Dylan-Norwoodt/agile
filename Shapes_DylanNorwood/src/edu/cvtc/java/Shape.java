/**
 * 
 */
package edu.cvtc.java;

/**
 * 
 */

/**
 * @author dylan
 *
 */
public abstract class Shape {
	
	// Attributes
	private Dialog messageBox;
	
	// Constructors
	public Shape() {
		
	}
	
	public Shape(Dialog messageBox) {
		setMessageBox(messageBox);
	}
	
	// Methods
	protected Dialog getMessageBox() {
		return this.messageBox;
	}
	
	private void setMessageBox(Dialog messageBox) {
		this.messageBox = messageBox;
	}
	
	public abstract float surfaceArea();
	
	public abstract float volume();
	
	

}

