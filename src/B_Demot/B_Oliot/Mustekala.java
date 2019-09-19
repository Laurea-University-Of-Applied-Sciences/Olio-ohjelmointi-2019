
public class Mustekala extends Kala {

	private int lonkeroita;

	public Mustekala() {

		setLaji("Mustekala");
		this.lonkeroita = 8;

	}

	public int getLonkeroita() {
		return lonkeroita;
	}

	public void setLonkeroita(int lonkeroita) {
		this.lonkeroita = lonkeroita;
	}

	public void vapautaMustetta() {
		System.out.println("Mustetta p‰‰stetty!");
	}

}
