package tp;

 

public class Bagage implements Transportable {
    private Double poids; // MonPoids.Bagage
    private Double volume;
    public final static Double POIDS_MOYEN = 5.0;
    public final static Double VOLUME_MOYEN = 10.0;

 

    public double getPoids() {
        if (this.poids == null)
            return POIDS_MOYEN; // En Kg
        else
            return this.poids;
    }

 

    public double getVolume() {
        if (this.volume == null)
            return VOLUME_MOYEN; 
        else
            return this.volume;
    }

 

    @Override
    public String toString() {
        return "Bagage [poids=" + poids + ", volume=" + volume + "]";
    }

 

    public Bagage(Double poids, Double volume) {
        super();
        this.poids = poids;
        this.volume = volume;
    }

 

    public Bagage() {
        super();
    }

 

    public void setPoids(Double poids) {
        this.poids = poids;
    }

 

    public void setVolume(Double volume) {
        this.volume = volume;
    }
    

 

}
 