package tp.volant;

import java.util.ArrayList;
import java.util.List;

import tp.Transportable;
import tp.personnes.Personne;

public class Avion extends ObjetVolantAbstrait {
	
	//en private une liste de personne , +get/set
	private List<Personne> listePersonnes = new ArrayList<>();
	
	private List<Transportable> listeAffairesOuBagages = new ArrayList<>();
	
	public void ajouterPersonne(Personne p) {
	    //avec du code qui ajoute p dans la liste de personne
		listePersonnes.add(p);
	}
	
	public void ajouterAffaireOuBagage(Transportable t) {
		listeAffairesOuBagages.add(t);
	}
	
	
	
	public void afficher() {
		//avec du code qui parcours les personnes de l'avion
		//et qui les affiche
		System.out.println("personnes montées dans l'avion:");
		for(Personne p : listePersonnes) {
			System.out.println("\t" + p); //"\t" pour tabulation , "\n" pour saut de ligne
		}
		double poidTotalAffairesOuBagages = 0.0;
		System.out.println("affaires ou babages dans l'avion:");
		for(Transportable t: listeAffairesOuBagages) {
			System.out.println("\t" + t); //"\t" pour tabulation , "\n" pour saut de ligne
			poidTotalAffairesOuBagages += t.getPoids();
		}
		System.out.println("poidTotalAffairesOuBagages="+poidTotalAffairesOuBagages);
	}

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

	public List<Personne> getListePersonnes() {
		return listePersonnes;
	}

	public void setListePersonnes(List<Personne> listePersonnes) {
		this.listePersonnes = listePersonnes;
	}
	
	

}
