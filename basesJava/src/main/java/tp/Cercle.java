package tp;

public class Cercle {
     public double xc;
     public double yc;
     public double rayon;
     
     @Override
	public String toString() {
		return "Cercle [xc=" + xc + ", yc=" + yc + ", rayon=" + rayon + "]";
	}

	public double perimetre() {
    	 return  (2 * Math.PI * this.rayon);
     }
     
     public void zoomer(double coefficient) {
    	 this.rayon =  (this.rayon * coefficient);
     }
}
