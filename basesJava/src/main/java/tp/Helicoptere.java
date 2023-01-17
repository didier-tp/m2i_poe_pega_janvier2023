package tp;

public class Helicoptere extends ObjetVolantAbstrait {

	public Helicoptere() {
		super();
	}

	public Helicoptere(Integer altitude, Integer altitudeMaxi) {
		super(altitude, altitudeMaxi);
	}

	@Override
	public String decoller() {
		return "decolle verticalement via hélices";
	}

}
