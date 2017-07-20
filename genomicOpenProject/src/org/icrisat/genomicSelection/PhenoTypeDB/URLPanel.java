package org.icrisat.genomicSelection.PhenoTypeDB;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class URLPanel extends JPanel {
	private CustomTextField bmsURLField;
	private JButton bmsConnect;

	public URLPanel(String title) {

		bmsURLField = new CustomTextField(30);
		bmsURLField.setPlaceholder("URL");
		
		
		
		
		
		
		bmsConnect = new JButton("Connect");
		bmsConnect.setPreferredSize(new Dimension(100, 23));
		bmsConnect.setFont(new Font("DejaVu Sans", Font.BOLD, 15));
		TitledBorder inner = new TitledBorder(title);
		inner.setTitleFont(new Font("DejaVu Sans", Font.BOLD, 20));
		Border outer = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		setBorder(BorderFactory.createCompoundBorder(outer, inner));
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.weightx = 1;
		gc.weighty = 1;

		gc.gridx = 0;
		gc.gridy = 0;
		gc.insets = new Insets(0, 0, 0, 5);
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.anchor = GridBagConstraints.LINE_END;
		add(bmsURLField, gc);

		gc.weightx = 1;
		gc.weighty = 1;

		gc.gridx = 1;
		gc.gridy = 0;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_START;
		add(bmsConnect, gc);
	}

}
