package tp;

public class Avion extends ObjetVolantAbstrait {

	public Avion() {
		super();
	}

	public Avion(Integer altitude, Integer altitudeMaxi) {
		super(altitude, altitudeMaxi);
	}

	@Override
	public String decoller() {
		return "decoller sur une piste";
	}

	@Override
	public String toString() {
		return "Avion [" + super.toString() + "]";
	}
	
	

}
