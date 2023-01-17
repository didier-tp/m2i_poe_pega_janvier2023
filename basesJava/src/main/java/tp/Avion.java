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

}
