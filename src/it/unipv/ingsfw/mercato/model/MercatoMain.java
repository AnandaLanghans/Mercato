package it.unipv.ingsfw.mercato.model;

import it.unipv.ingsfw.mercato.view.MercatoGUI;

// nuovo commit prova 
public class MercatoMain {

	public static void main(String[] args) {
		// avvio del distributtore di numeri
		Distributoredinumeri distributore= new Distributoredinumeri();
		
		MercatoGUI frame = new MercatoGUI();
		
		// Avvio 5 clienti
				for(int i=0; i<3; i++) {
					Cliente c= new Cliente(distributore);
					Thread t1= new Thread(c);
					t1.start();
				}
		
		// avvio del venditore
		Venditore v = new Venditore(distributore);
		Thread t = new Thread(v);
		t.start();
		
		

		
	}

}