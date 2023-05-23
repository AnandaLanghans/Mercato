package it.unipv.ingsfw.mercato.model;

import it.unipv.ingsfw.mercato.view.ClienteGUI;

public class Multi {


	Venditore ven;
	
	public Multi() {
		
	}
	
	public void start() {
		
		Distributoredinumeri distributore= new Distributoredinumeri();
		for(int i=0; i<3; i++) {
			Cliente c= new Cliente(distributore);
			Thread t1= new Thread(c);
			t1.start();
			ClienteGUI gui=new ClienteGUI(c,distributore);
			
		}
			
			// avvio del venditore
			Venditore v = new Venditore(distributore);
			Thread t = new Thread(v);
			t.start();
			
			
	}
		
	
}
