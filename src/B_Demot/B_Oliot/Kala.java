
public class Kala {

	static int parvenKoko;
	private String laji;
	private double paino;

	public Kala() {
		// Kasvatataan parven kokoa
		// Tämä konstruktori ajetaan siis aina kun
		// Kala-olio tai joku sen alaluokista ajetaan
		parvenKoko++;
	}

	public static int getParvenKoko() {
		return parvenKoko;
	}

	public static void setParvenKoko(int parvenKoko) {
		Kala.parvenKoko = parvenKoko;
	}

	public String getLaji() {
		return laji;
	}

	public void setLaji(String laji) {
		this.laji = laji;
	}

	public double getPaino() {
		return paino;
	}

	public void setPaino(double paino) {
		this.paino = paino;
	}

	@Override
	public String toString() {

		return "Kalan tilatiedot: ( Parvessa kaloja: " + this.parvenKoko + ") "
				+ "+------------------------------------------+ " + " Laji: Mustekala " + " Paino: 3.2"
				+ " Lonkeroita: 8 " + "+------------------------------------------+ ";

	}

}
