package it.unipv.ingsfw.mercato.model;

public class Cliente implements Runnable {
	Distributoredinumeri distributore;
	
	int mioNumero;
	public Cliente(Distributoredinumeri distributore) {
		this.distributore=distributore;
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
