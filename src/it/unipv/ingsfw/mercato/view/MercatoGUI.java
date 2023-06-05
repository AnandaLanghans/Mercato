package it.unipv.ingsfw.mercato.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;
import javax.swing.border.Border;

public class MercatoGUI extends JFrame{

	private JLabel ven;
	private JLabel cl;
	private JLabel servito;
	public MercatoGUI() {
		setTitle("Mercato");
		
		JPanel venditore = new JPanel();
		venditore.setLayout (new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();
		venditore.setBackground(Color.white);
		venditore.setPreferredSize(new Dimension(500,500));

		JPanel cliente = new JPanel();
		cliente.setLayout (new GridBagLayout());
		GridBagConstraints c1=new GridBagConstraints();
		cliente.setBackground(Color.white);
		cliente.setPreferredSize(new Dimension(500,500));

		
		Pannello pannello=new Pannello(this);
		
		c.anchor = GridBagConstraints.CENTER;
		ven=new JLabel("Venditore");
		ven.setFont(new Font("Comic Sans MS", Font.BOLD,20));
		ven.setHorizontalAlignment(SwingConstants. CENTER);
		Border border = BorderFactory.createLineBorder(Color.black, 2); 
		ven.setBorder(border);
		ven.setPreferredSize(new Dimension(100,100));
		ven.setForeground(Color.black);
		c.insets= new Insets (0,0,0,0);
		c.gridx=0;
		c.gridy=0;
		
		venditore.add(ven,c);
		

		c.anchor = GridBagConstraints.CENTER;
		servito=new JLabel("Cliente");
		servito.setFont(new Font("Comic Sans MS", Font.BOLD,20));
		servito.setHorizontalAlignment(SwingConstants. CENTER);
		servito.setBorder(border);
		servito.setPreferredSize(new Dimension(100,100));
		servito.setForeground(Color.black);
		c.insets= new Insets (0,250,0,0);
		c.gridx=0;
		c.gridy=0;
		
		venditore.add(servito,c);
		
		
		c1.anchor = GridBagConstraints.CENTER;
		cl=new JLabel("Coda");
		cl.setFont(new Font("Comic Sans MS", Font.BOLD,20));
		cl.setHorizontalAlignment(SwingConstants. CENTER);
		cl.setBorder(border);
		cl.setPreferredSize(new Dimension(100,100));
		cl.setForeground(Color.black);
		c1.insets= new Insets (0,0,0,200);
		c1.gridx=0;
		c1.gridy=0;
		
		cliente.add(cl,c1);
		
		
		add(venditore,BorderLayout.WEST);
		add(pannello,BorderLayout.EAST);
		add(cliente,BorderLayout.CENTER);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	
		public void changeLabelVen(final Color color) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            	ven.setOpaque(true);
                ven.setBackground(color);
            }
        });
	}   
        public void changeLabelCliente(final Color color) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                	cl.setOpaque(true);
                    cl.setBackground(color);
                }
            });
}
        
        public void changeLabelServito(final Color color) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                	servito.setOpaque(true);
                    servito.setBackground(color);
                }
            });
}
}
