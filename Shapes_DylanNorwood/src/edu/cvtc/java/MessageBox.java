package edu.cvtc.java;

import javax.swing.JOptionPane;

public class MessageBox implements Dialog{
	
	MessageBox() {
		
	}

	@Override
	public int show(String message, String title) {
		
		JOptionPane.showMessageDialog(null, message);
		return JOptionPane.OK_OPTION;
	}

}
