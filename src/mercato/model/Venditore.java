package mercato.model;

public class Venditore implements Runnable {
	Distributoredinumeri distributore;
	public Venditore(Distributoredinumeri distributore) {
		this.distributore= distributore;
	}

	@Override
	public void run() {
		while(true) {
			System.out.println("Venditore "+ Thread.currentThread().getId()+ ": Attende il cliente ");
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
