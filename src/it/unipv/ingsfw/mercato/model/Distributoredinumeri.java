package it.unipv.ingsfw.mercato.model;

import java.awt.Color;

import it.unipv.ingsfw.mercato.view.MercatoGUI;

public class Distributoredinumeri {
	int numAttesa;
	int numServito;
	int contpersone;
	MercatoGUI gui;
	public Distributoredinumeri(MercatoGUI gui) {
		this.numAttesa=0;
		this.numServito=0;
		this.contpersone=0;
		this.gui=gui;
	}
	
	// IL cliente ritira il numerino all'ingresso
	public synchronized int ritiraNumero() {
		numAttesa++;
		contpersone++;
		notifyAll();
		return numAttesa;
		
	}

	
	// il cliente attende il suo numero
	public synchronized void attendiNumero(int num) {
		while(numServito != num) {
			try {
				wait();
			} catch(InterruptedException e) {
				System.out.println("Abort");
				e.printStackTrace();
			}
		}
	}
	
	
	
	// Il venditore controlla se ci sono clienti in fila
	public synchronized int ciSonoClienti() {
		while (numAttesa == numServito) {
			try {
				wait();
				//gui.changeLabelVen(Color.red);
					
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		if(contpersone!=0) {
			contpersone--;
			}
		numServito++;
		notifyAll();
		
		
		
		
		return numServito;
	}
	
	
	public synchronized int getContatore() {
		
		return contpersone;
	}
	
	
}
