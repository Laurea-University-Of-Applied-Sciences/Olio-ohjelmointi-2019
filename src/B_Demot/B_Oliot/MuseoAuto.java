
public class MuseoAuto extends Auto {
	
	
	int käyttöönottovuosi;

	public MuseoAuto() {
		super();
		this.käyttöönottovuosi = 1950;
	}

	@Override
	public String toString() {
		return "MuseoAuto [toString()=\" "+ super.toString() +" käyttöönottovuosi=" + käyttöönottovuosi + "]";
	}

	 
	

}
