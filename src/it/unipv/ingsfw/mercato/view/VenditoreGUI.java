package it.unipv.ingsfw.mercato.view;

import java.awt.Color;
import java.awt.Font;
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
		setBackground(Color.white);
		
		
	
		ImageIcon Icon=new ImageIcon("Risorse/Immagini/bancarella2.png");
		Image image = Icon.getImage();
		Image newimg = image.getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH);  
		Icon = new ImageIcon(newimg);
		
		
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		JLabel l= new JLabel(Icon);
		c.gridx=0;
		c.gridy=0;
		c.insets= new Insets (100,0,170,500);
		add(l,c);
		
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		JLabel cont= new JLabel("Venditore");
		cont.setFont(new Font("Comic Sans MS", Font.BOLD,15));
		cont.setForeground(new Color(0,0,0));
		c.gridx=0;
		c.gridy=0;
		c.insets= new Insets (100,200,0,0);
		add(cont,c);
	}

}