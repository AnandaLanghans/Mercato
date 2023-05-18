package mercato.model;

public class Distributoredinumeri {
	int numAttesa;
	int numServito;
	public Distributoredinumeri() {
		this.numAttesa=0;
		this.numServito=0;
	}
	
	// IL cliente ritira il numerino all'ingresso
	public synchronized int ritiraNumero() {
		numAttesa++;
		notifyAll();
		return numAttesa;
	}
	
	// il cliente attende il suo numero
	public synchronized void attendiNumero(int num) {
		while(numServito == num) {
			try {
				wait();
			} catch(InterruptedException e) {
				System.out.println("Abort");
				e.printStackTrace();
			}
		}
	}
	
	// Il venditore imposta il numero inizziale
	public void impostaInizio(int num) {
		numAttesa= num;
		numServito= num;
	}
	
	// Il venditore controlla se ci sono pazienti in fila
	public synchronized int ciSonoClienti() {
		while (numAttesa == numServito) {
			try {
				wait();
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		numServito++;
		notifyAll();
		return numServito;
	}

}
