package it.unipv.ingsfw.mercato.model;

public class Cliente implements Runnable {
	Distributoredinumeri distributore;
	public Cliente(Distributoredinumeri distributore) {
		this.distributore=distributore;
	}

	@Override
	public void run() {
		int mioNumero= distributore.ritiraNumero();
		System.out.println("Cliente: "+ Thread.currentThread().getId()+ " Ho preso il numero "+ mioNumero);
		
		try {
			distributore.attendiNumero(mioNumero);
			Thread.sleep(1000);
			if(mioNumero== distributore.numServito ) {
				System.out.println("Il cliente "+ Thread.currentThread().getId()+ ": Viene servito!");
			}
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
			
		
		
	
	}

}
