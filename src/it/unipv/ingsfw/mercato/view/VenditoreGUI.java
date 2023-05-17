package it.unipv.ingsfw.mercato.view;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VenditoreGUI extends JPanel {
	
	public VenditoreGUI() {
		
		setLayout (new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();
		setBackground(new Color (0,0,0,0));
		
	
		ImageIcon Icon=new ImageIcon("Risorse/immagini/download.png");
		Image image = Icon.getImage();
		Image newimg = image.getScaledInstance(170, 170, java.awt.Image.SCALE_SMOOTH);  
		Icon = new ImageIcon(newimg);
		
		
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		JLabel l= new JLabel(Icon);
		
		c.gridx=0;
		c.gridy=0;
		add(l,c);
	}

}
