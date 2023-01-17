package tp;

public class Cercle {
	
	 public static final double PI=3.141592653589;
	
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
	
	public static double distanceEntreCentresDe2Cercles(Cercle c1,Cercle c2) {
		return Math.sqrt(Math.pow(c2.xc - c1.xc, 2) + Math.pow(c2.yc - c1.yc, 2));
	}

	public double perimetre() {
		 //Cercle.PI = 3.78; //impossible car constante que l'on ne peut pas modifier , mot clef final
    	 return  (2 * Cercle.PI * this.rayon);
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
