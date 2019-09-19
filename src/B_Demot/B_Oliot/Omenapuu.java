import java.util.ArrayList;
import java.util.Arrays;

public class Omenapuu {

	int istutusVuosi;
	// Omena[] omenat = new Omena[5];
	ArrayList<Omena> omenat = new ArrayList<Omena>();
	Ötökkä[] ötökät = new Ötökkä[5];
	@Override
	public String toString() {
		return "Omenapuu [istutusVuosi=" + istutusVuosi + ", omenat=" + Arrays.toString(omenat) + ", ötökät=" + Arrays.toString(ötökät)
				+ "]";
	}


	

}
