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
	


	@Override
	public void run() {
		int mioNumero= distributore.ritiraNumero();
		System.out.println("Cliente: "+ Thread.currentThread().getId()+ " Ho preso il numero  e sono in attesa"+ mioNumero);
		gui.changeLabelCliente(Color.blue);
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		distributore.attendiNumero(mioNumero);
		System.out.println("Cliente: "+ Thread.currentThread().getId()+ ": Viene servito il cliente numero "+ mioNumero);
		gui.changeLabelServito(Color.red);
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		
		}
		gui.changeLabelServito(Color.green);
		int clienti=distributore.getContatore();
		System.out.println("Clienti: Ci sono " + clienti +" in coda");
		if(clienti == 0) {
			gui.changeLabelServito(Color.WHITE);
		}

	}
		
}
