
public class Auto {

	@Override
	public String toString() {
		return "Auto [väri=" + väri + ", nopeus=" + nopeus + ", ajokilometrit=" + ajokilometrit + "]";
	}

	private String väri;
	private int nopeus;
	private int ajokilometrit;
	static int autojenLkm;
	int GPSID; 
	
	
	public Auto() {

		this.väri = "Ei väriä";
		this.nopeus = 10;
		this.ajokilometrit = 0;
	}

	public String getVäri() {
		return väri;
	}

	public void setVäri(String väri) {
		this.väri = väri;
	}

	public int getNopeus() {
		return nopeus;
	}

	public void setNopeus(int nopeus) {
		this.nopeus = nopeus;
	}

	public int getAjokilometrit() {
		return ajokilometrit;
	}

	public void setAjokilometrit(int ajokilometrit) {
		this.ajokilometrit = ajokilometrit;
	}

	public static int getAutojenLkm() {
		return autojenLkm;
	}

	public static void setAutojenLkm(int autojenLkm) {
		Auto.autojenLkm = autojenLkm;
	}

}
