package it.unipv.ingsfw.mercato.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import it.unipv.ingsfw.mercato.model.Multi;


public class Pannello extends JPanel {
	
	public Pannello (MercatoGUI gui){
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		
		

		Dimension screenSize = kit.getScreenSize();
		//
		setLayout (new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();
		setBackground(Color.white);
	//	setSize(500,screenHeight);
		
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		JLabel label=new JLabel("INIZIA :");
		label.setFont(new Font("Comic Sans MS", Font.BOLD,15));
		label.setForeground(Color.black);
		c.insets= new Insets (0,0,100,300);
		c.gridx=0;
		c.gridy=0;
		add(label, c);
		//
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		JButton start= new JButton("start");
		start.setFont(new Font("Comic Sans MS", Font.PLAIN,15));
		start.setForeground(Color.black);
		start.setBackground(Color.green);
		start.setOpaque(true);
		start.setBorderPainted(false);
		start.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Multi mt= new Multi(gui);
				mt.start();
			}
		});
		
		
		//da mettere l'action listener
		
		c.gridx=0;
		c.gridy=1;
		
		add(start,c);
	}

}