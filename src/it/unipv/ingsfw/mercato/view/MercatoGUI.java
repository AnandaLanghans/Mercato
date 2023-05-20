package it.unipv.ingsfw.mercato.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
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
		
		setLayout (new BorderLayout());
		
		setBackground(Color.white);
		
		setTitle("Mercato");
		JLayeredPane pane = this.getLayeredPane();
		
		
		VenditoreGUI vending=new VenditoreGUI();
		
		Pannello panel = new Pannello();
		ClienteGUI cl=new ClienteGUI();
		
	
		cl.setBounds(0,0,1000,1000);
		pane.add(cl, new Integer(2));
		add(panel,BorderLayout.EAST);
		
		add(vending,BorderLayout.WEST);
		
		setSize(screenWidth,screenHeight);
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}