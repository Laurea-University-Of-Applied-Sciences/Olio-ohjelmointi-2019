package B_Demot.A_Kapselointi.Omenakone;

import java.util.ArrayList;

public class Dynaamisuutta {

	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<Integer>();

		lista.add(1);
		lista.add(4);
		lista.add(11);

		System.out.println(lista);
		System.out.println(lista.size());
		System.out.println( lista.contains(4) );

	}

}
