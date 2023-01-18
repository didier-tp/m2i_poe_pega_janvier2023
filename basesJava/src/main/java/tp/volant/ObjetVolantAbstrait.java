package tp.volant;

public abstract class ObjetVolantAbstrait implements Volant{
	
	private Integer altitude;
	private Integer altitudeMaxi;
	
	public abstract String decoller();//opération sans code ici
	     //qui devra absolument être codée sans les sous classes
	
	@Override
	public String toString() {
		return "ObjetVolantAbstrait [altitude=" + altitude + ", altitudeMaxi=" + altitudeMaxi + "]";
	}
	
	
	
	
	public ObjetVolantAbstrait() {
		super();
		this.altitude=0;
		this.altitudeMaxi = Volant.DEFAULT_MAX_ALTITUDE;
	}




	public ObjetVolantAbstrait(Integer altitude, Integer altitudeMaxi) {
		super();
		this.altitude = altitude;
		this.altitudeMaxi = altitudeMaxi;
	}




	public Integer getAltitude() {
		return altitude;
	}
	public void setAltitude(Integer altitude) {
		this.altitude = altitude;
	}
	public Integer getAltitudeMaxi() {
		return altitudeMaxi;
	}
	public void setAltitudeMaxi(Integer altitudeMaxi) {
		this.altitudeMaxi = altitudeMaxi;
	}
	
	

}
