
public class Auto {

	@Override
	public String toString() {
		return "Auto [v�ri=" + v�ri + ", nopeus=" + nopeus + ", ajokilometrit=" + ajokilometrit + "]";
	}

	private String v�ri;
	private int nopeus;
	private int ajokilometrit;
	static int autojenLkm;
	int GPSID; 
	
	
	public Auto() {

		this.v�ri = "Ei v�ri�";
		this.nopeus = 10;
		this.ajokilometrit = 0;
	}

	public String getV�ri() {
		return v�ri;
	}

	public void setV�ri(String v�ri) {
		this.v�ri = v�ri;
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
