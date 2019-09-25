/**
 * 
 */
package edu.cvtc.java.test;

import javax.swing.JOptionPane;

import edu.cvtc.java.Dialog;

/**
 * @author dylan
 *
 */
public class MessageBoxSub implements Dialog {
	
	MessageBoxSub() {
		
	}
	
	

	@Override
	public int show(String message, String title) {
		// TODO Auto-generated method stub
		return JOptionPane.OK_OPTION;
	}
	
}
