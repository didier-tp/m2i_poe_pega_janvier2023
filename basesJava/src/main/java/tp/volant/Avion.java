package tp.volant;

public class Avion extends ObjetVolantAbstrait {

	public Avion() {
		super();
	}

	public Avion(Integer altitude, Integer altitudeMaxi) {
		super(altitude, altitudeMaxi);
	}

	@Override
	public String decoller() {
		this.setAltitude(500);
		return "decoller sur une piste";
	}

	@Override
	public String toString() {
		return "Avion [" + super.toString() + "]";
	}
	
	

}
