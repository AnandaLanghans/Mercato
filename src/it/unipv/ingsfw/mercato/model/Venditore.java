package it.unipv.ingsfw.mercato.model;

import java.awt.Color;

import it.unipv.ingsfw.mercato.view.MercatoGUI;

public class Venditore implements Runnable {
	Distributoredinumeri distributore;
	MercatoGUI gui;
	public Venditore(Distributoredinumeri distributore,MercatoGUI gui) {
		this.distributore= distributore;
		this.gui=gui;
	}

	@Override
	public void run() {
		while(true) {
			System.out.println("Venditore "+ Thread.currentThread().getId()+ ": Attende il cliente ");
			gui.changeLabelVen(Color.green);
			int cliente = distributore.ciSonoClienti();
			System.out.println("Venditore "+ Thread.currentThread().getId()+ ": Serve il cliente "+ cliente);
			
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
