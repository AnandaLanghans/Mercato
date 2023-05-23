package it.unipv.ingsfw.mercato.model;

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
		}
			
			// avvio del venditore
			Venditore v = new Venditore(distributore);
			Thread t = new Thread(v);
			t.start();
	}
		
	
}
