
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
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

		// Foreachilla

		for (String string : parit.keySet()) {
			System.out.println(string + " ==> " + parit.get(string));
		}

		// Lambda notaatiolla
		parit.forEach((k, v) -> System.out.println(k + " : " + (v)));

		// Iteraattorilla, tapa 1

		Iterator<Entry<String, String>> it = parit.entrySet().iterator();

		while (it.hasNext()) {
			HashMap.Entry<String, String> alkio = (HashMap.Entry<String, String>) it.next();
			System.out.println(alkio.getKey() + " = " + alkio.getValue());
		}

		// Iteraattorilla, tapa 2

		System.out.println("HashMap Key-Value Pairs : ");
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			System.out.println("Key is: " + me.getKey() + " & " + " value is: " + me.getValue());
		}

		System.out.println("\nAvaimen \"Viides\" arvo HashMapista:\n");
		System.out.println(parit.get("kissa"));

		parit.put("koira", "Dog");

	}

	// Arvon hakeminen ja avaimen palautus
	public static <T, E> Set<T> getKeysByValue(Map<T, E> map, E value) {
		Set<T> keys = new HashSet<T>();
		for (Entry<T, E> entry : map.entrySet()) {
			if (Objects.equals(value, entry.getValue())) {
				keys.add(entry.getKey());
			}
		}
		return keys;
	}

}
