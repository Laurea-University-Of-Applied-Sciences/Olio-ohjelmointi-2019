
public class Keuhkokala extends Kala {

	// Sis�lt�� kalan varsievien lukum��r�n
	private int varsievia;

	public Keuhkokala() {
		setLaji("Keuhkokala");
	}

	// Tulostaa tekstin �Huoh � Hengittelen ilmaa.�
	public void hengita() {
		System.out.println("Huoh - hengittelen ilmaa!");
	}

	public int getVarsievia() {
		return varsievia;
	}

	public void setVarsievia(int varsievia) {
		this.varsievia = varsievia;
	}

}
