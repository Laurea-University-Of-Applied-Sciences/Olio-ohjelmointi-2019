
public class TestaaKaloja {
 

	public static void main(String[] args){

		 Mustekala matti = new Mustekala();
		 matti.setPaino(3.2);
		 System.out.println(matti);

		 Keuhkokala keke  = new Keuhkokala();
		 keke.setPaino(4.62);
		 System.out.println(matti);

		 matti.vapautaMustetta();
		 keke.hengita();

		 keke.setVarsievia(5);
		 matti.setLonkeroita(6);

		System.out.println(matti);
		System.out.println(keke);

//		Tulostus (typistettynä):
//
//		Kalan tilatiedot: ( Parvessa kaloja: 3)  
//		 +------------------------------------------+
//		+ Laji: Mustekala
//		+ Paino: 3.2
//		+ Lonkeroita: 8
//		+------------------------------------------+
//
//		Kalan tilatiedot: ( Parvessa kaloja: 3)  
//		 +------------------------------------------+
//		+ Laji: Varsieväkala
//		+ Paino: 4.62
//		+ Varsieviä: 4
//		+------------------------------------------+


		}

}
