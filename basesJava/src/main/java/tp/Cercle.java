package tp;

public class Cercle {
     private double xc;
     private double yc;
     private double rayon;
     
    

	public Cercle(double xc, double yc, double rayon) {
		super();
		this.xc = xc;
		this.yc = yc;
		this.rayon = rayon;
	}
	
	

	public Cercle() {
		super();
	}



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



	public double getXc() {
		return xc;
	}



	public void setXc(double xc) {
		this.xc = xc;
	}



	public double getYc() {
		return yc;
	}



	public void setYc(double yc) {
		this.yc = yc;
	}



	public double getRayon() {
		return rayon;
	}



	public void setRayon(double rayon) {
		if(rayon >=0)
		    this.rayon = rayon;
		else {
			System.out.println("rayon négatif invalide pas pris en compte");
			//new RuntimeException("rayon négatif invalide pas pris en compte");
		}
	}
     
     
}
