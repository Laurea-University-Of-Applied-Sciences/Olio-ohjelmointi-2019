
public class Keuhkokala extends Kala {

	// Sis‰lt‰‰ kalan varsievien lukum‰‰r‰n
	private int varsievia;

	public Keuhkokala() {
		setLaji("Keuhkokala");
	}

	// Tulostaa tekstin îHuoh ñ Hengittelen ilmaa.î
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
