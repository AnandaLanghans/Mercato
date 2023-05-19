package it.unipv.ingsfw.mercato.view;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import it.unipv.ingsfw.mercato.model.Cliente;
import it.unipv.ingsfw.mercato.model.Distributoredinumeri;

public class ClienteGUI extends JPanel {

//	Distributoredinumeri db;
//	Cliente cliente;
	
	public ClienteGUI() {
		

		setLayout (new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();
		setBackground(new Color (0,0,0,0));
		
		ImageIcon Icon=new ImageIcon("Risorse/Immagini/omino.png");
		Image image = Icon.getImage();
		Image newimg = image.getScaledInstance(170, 250, java.awt.Image.SCALE_SMOOTH);  
		Icon = new ImageIcon(newimg);
		Button b = new Button();


	//	if(cliente.getN()== db.getNum()) {
			
			c.anchor = GridBagConstraints.FIRST_LINE_START;
			JLabel l= new JLabel(Icon);
			c.gridx=1;
			c.gridy=1;
			c.insets= new Insets (0,0,0,400);
			add(l,c);
			
		}
		
	/*	else {
			
			c.anchor = GridBagConstraints.FIRST_LINE_START;
			JLabel l= new JLabel(Icon);
			c.gridx=1;
			c.gridy=1;
			c.insets= new Insets (0,0,0,200);
			add(l,c);
		}*/
		
//	}
	
	

}
