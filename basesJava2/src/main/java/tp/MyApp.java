package tp;

import tp.produits.Catalogue;

public class MyApp {

	

	public static void main(String[] args) {
		//lire un fichier produits.csv
		//List de objets de la classe Produit(numero,label,prix)
		//au sein d'une classe Catalogue
		Catalogue c = new Catalogue();
		c.lireFichier("produits.csv");
		//c.lireFichier("produits2.csv");
		c.afficherProduits();
		System.out.println("moyennePrixDesProduits="+c.calculerMoyennePrixDesProduits());
		//calculer la moyenne (et éventuellement écart_type) des prix des produits
		
		
		//générer un fichier stats.txt avec la moyenne calculée
		
	}

}
