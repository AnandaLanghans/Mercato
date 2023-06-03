package it.unipv.ingsfw.mercato.model;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;

import it.unipv.ingsfw.mercato.view.MercatoGUI;


public class Cliente implements Runnable  {
	Distributoredinumeri distributore;
	
	MercatoGUI gui;
	
	int mioNumero;
	public Cliente(Distributoredinumeri distributore, MercatoGUI gui) {
		this.distributore=distributore;
		this.gui=gui;
		
	}
	
	public void mioNum() {
		
		mioNumero= distributore.ritiraNumero();
		
	}
	
	public int getN() {
		
		return mioNumero;
	}

	@Override
	public void run() {
		//int mioNumero= distributore.ritiraNumero();
		mioNum();
		System.out.println("Cliente: "+ Thread.currentThread().getId()+ " Ho preso il numero "+ getN());
		gui.changeLabelCliente(Color.red);
		//ClienteGUI gui=new ClienteGUI(c,distributore);
	
		try {
			distributore.attendiNumero(mioNumero);
		
			Thread.sleep(1000);
			
			if(mioNumero== distributore.numServito ) {
				System.out.println("Il cliente "+ Thread.currentThread().getId()+ ": Viene servito!");	
				gui.changeLabelServito(Color.green);
				wait(1000);
				
			}
			else {
				
				gui.changeLabelServito(Color.white);
			}
			
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}
	
	
}
