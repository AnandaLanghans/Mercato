package it.unipv.ingsfw.mercato.model;

import java.awt.Color;

import it.unipv.ingsfw.mercato.view.MercatoGUI;

public class Multi {
	public int NClienti = 5;

	MercatoGUI gui;;
	
	public Multi(MercatoGUI gui) {
		
		this.gui=gui;
	}
	
	public void start() {
		
		Distributoredinumeri distributore= new Distributoredinumeri(gui);
	
		for(int i=0; i<NClienti; i++) {
			
			Cliente c= new Cliente(distributore,gui);
			Thread t1= new Thread(c);
			t1.start();
			
			
		}
			
			// avvio del venditore
			Venditore v = new Venditore(distributore,gui);
			Thread t = new Thread(v);
			t.start();
			
		
			
			
	}
		
	
}
