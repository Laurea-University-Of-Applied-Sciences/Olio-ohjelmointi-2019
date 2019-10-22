import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class Tietorakenteita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList<ArrayList<String>> uusiTaulu = new ArrayList<ArrayList<String>>();
//
//		uusiTaulu.add(new ArrayList<>());
//		uusiTaulu.add("Toka");
//		uusiTaulu.add("Kolmas");

//		for (int i = 0; i < uusiTaulu.size(); i++) {
//			System.out.println(uusiTaulu.get(i));
//		}

		TreeSet<String> fruits = new TreeSet<String>();

		fruits.add("Eka");
		fruits.add("Toka");
		fruits.add("Kolmas");

		System.out.println("\nSanat TreeSetistä:\n");

		Iterator<String> itr = fruits.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		HashMap<String, String> parit = new HashMap<>();
		parit.put("koira", "dog");
		parit.put("kissa", "cat");

		System.out.println("\nSanat HashMapista:\n");

		// Iterator<Entry<String, String>> it = parit.entrySet().iterator();

		for (String string : parit.keySet()) {
			System.out.println(string + " ==> " + parit.get(string));
		}

//		while (it.hasNext()) {
//			HashMap.Entry<String, String> alkio = (HashMap.Entry<String, String>) it.next();
//			System.out.println(alkio.getKey() + " = " + alkio.getValue());
//		}

		System.out.println("\nAvaimen \"Viides\" arvo HashMapista:\n");
		System.out.println(parit.get("kissa"));

		parit.put("koira", "Dog");

	}

}
