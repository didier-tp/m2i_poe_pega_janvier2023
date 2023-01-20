package tp.produits;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Catalogue {
	
	private List<Produit> listeProduits = new ArrayList<>();
	//private Map<String,List<Produit>> mapProduits = new HashMap<>();
	
    public void afficherProduits(){
    	
    	Collections.sort(listeProduits,
    	(Produit p1,Produit p2)->{ return Double.compare(p1.getPrix(), p2.getPrix());} 
    	/* (p1,p2)-> Double.compare(p1.getPrix(), p2.getPrix()) */
    	 /*  (Produit p1,Produit p2)->{ return p1.getLabel().compareTo(p2.getLabel());}	*/
    	);
		
    	for(Produit p :  listeProduits) {
			System.out.println(p);//p.toString()
		}
	}
    
    public void afficherProduits(double prixMini,double prixMaxi){
    	/*
    	List<Produit> listeProduitsFiltresEtTries = 
    	this.listeProduits.stream()
    	.filter( (Produit p)-> (p.getPrix() >= prixMini && p.getPrix() <= prixMaxi) )
    	.sorted((Produit p1,Produit p2)->{ return Double.compare(p1.getPrix(), p2.getPrix());})
    	.collect(Collectors.toList());
    	
    	for(Produit p :  listeProduitsFiltresEtTries) {
			System.out.println(p);//p.toString()
		}
    	*/
    	
    	this.listeProduits.stream()
    	 .filter( (Produit p)-> (p.getPrix() >= prixMini && p.getPrix() <= prixMaxi) )
    	 .sorted((Produit p1,Produit p2)->{ return Double.compare(p1.getPrix(), p2.getPrix());})
    	 .forEach((Produit p) -> System.out.println(p));
    	    	
	}
    
    public double calculerMoyennePrixDesProduits(){
    	double sommePrix=0;
    	for(Produit p :  listeProduits) {
    		//sommePrix=sommePrix+p.getPrix();
    		sommePrix += p.getPrix();
		}
    	double moyenne = sommePrix / listeProduits.size();
    	return moyenne;
    }
    
    public void ecrireFichierStat(String fileName) {
    	try {
			PrintStream ps = new PrintStream(new FileOutputStream(fileName));
			ps.println("moyennePrixDesProduits="+ this.calculerMoyennePrixDesProduits());
			ps.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

	public void lireFichier(String fileName) {
		try {
			FileInputStream fis = new FileInputStream(fileName);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			br.readLine();//lecture de la première ligne du fichier .csv avec titre des colonnes
			
			//for(String ligne=br.readLine();ligne != null;ligne=br.readLine() ) {
			String ligne=br.readLine();
			while(ligne != null) {
				   String[] t = ligne.split(";");
				   Produit p = new Produit(Integer.parseInt(t[0]),
						                   t[1],
						                   Double.parseDouble(t[2]));
				   this.listeProduits.add(p);
				   ligne=br.readLine();
			}
			br.close();fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Catalogue() {
	}

	public List<Produit> getListeProduits() {
		return listeProduits;
	}
	
	
	
	

}
