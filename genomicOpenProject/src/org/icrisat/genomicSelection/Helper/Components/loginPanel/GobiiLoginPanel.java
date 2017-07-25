package org.icrisat.genomicSelection.helper.components.loginPanel;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;

public class GobiiLoginPanel extends LoginPanel {

	private Frame parent;

	public GobiiLoginPanel(Frame parent) {
		super(parent, true);
		this.parent = parent;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Welcome to Gobii Login");
		String password = String.valueOf(passwordField.getPassword());
		System.out.println("UserName :" + usernameField.getText() + "\t password  :" + password);

	}
}