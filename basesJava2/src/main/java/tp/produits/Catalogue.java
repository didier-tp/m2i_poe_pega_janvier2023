package tp.produits;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Catalogue {
	
	private List<Produit> listeProduits = new ArrayList<>();
	//private Map<String,List<Produit>> mapProduits = new HashMap<>();
	
    public void afficherProduits(){
		for(Produit p :  listeProduits) {
			System.out.println(p);//p.toString()
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
