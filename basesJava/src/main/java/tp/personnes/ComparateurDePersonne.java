package tp.personnes;

import java.util.Comparator;

public class ComparateurDePersonne implements Comparator<Personne>{

	@Override
	public int compare(Personne o1, Personne o2) {
		//return o1.getTaille() - o2.getTaille();
		if(o1.getNom() != null) 
			return o1.getNom().compareTo(o2.getNom());
		else return -1;
	}


}
