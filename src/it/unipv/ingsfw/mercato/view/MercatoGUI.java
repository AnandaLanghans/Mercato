package it.unipv.ingsfw.mercato.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;



public class MercatoGUI extends JFrame{

	public MercatoGUI () {
		
		startFrame();
	}
	
	
	public void startFrame() {
		
		Toolkit kit = Toolkit.getDefaultToolkit();

		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		
		setBackground(new Color (255,255,255));

		setTitle("Mercato");
		JLayeredPane pane = this.getLayeredPane();
		
		
		VenditoreGUI panel=new VenditoreGUI();
		ClienteGUI cl=new ClienteGUI();
		
		panel.setBounds(0, 0, 900,900);
		cl.setBounds(0,0,200,200);
		pane.add(panel, new Integer(1));
		pane.add(cl, new Integer(2));
		add(panel);
		add(cl);
		setSize(screenWidth,screenHeight);
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}