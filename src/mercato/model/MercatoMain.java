package mercato.model;

import mercato.view.MercatoGUI;

// nuovo commit prova 
public class MercatoMain {

	public static void main(String[] args) {
		System.out.println("commit modificato");
		// avvio del distributtore di numeri
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
		
		MercatoGUI m= new MercatoGUI();

		// Avvio 5 clienti
		
		
	}
	
}
