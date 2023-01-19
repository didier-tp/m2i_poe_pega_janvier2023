package tp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import tp.personnes.Employe;
import tp.personnes.Personne;
import tp.volant.Avion;

public class MyApp2 {


	public static void main(String[] args) {
		//testException();
		//testException2();
		//testCollection();
		//testCollection2();
		//testCollection3();
		testAvion();
		testRelectureAvion();
		//testMap();
		//testDate();
	}
	
	public static void testDate() {
		//SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String sdate = simpleDateFormat.format(new Date());
        System.out.println(sdate);
	}
	
	public static void testMap() {
		Map<Integer,String> mapMois = new HashMap<>();
		mapMois.put(1, "janvier");
		//...
		mapMois.put(12, "decembre");
		
		String nomDuMoisNumero12 = mapMois.get(12);
		System.out.println("nomDuMoisNumero12="+nomDuMoisNumero12);
	}
	
	public static void testAvion() {
	   Avion a1 = new Avion();
	   Employe e1 = new Employe("pilote","Emerite","pe@xy.com",177,1,"motPasseSecret",3500.0);
	   e1.setType(Employe.TypeEmploye.RESPONSABLE);
	   a1.ajouterPersonne(e1);
	   a1.ajouterPersonne(new Employe("hotesse","Principale","hp@xy.com",163,2,"motPasse",2500.0));
	   a1.ajouterPersonne(new Personne("jean","Bon","jb@xy.com",177));
	   a1.ajouterPersonne(new Personne("axelle","Aire","aa@xy.com",167));
	   a1.ajouterPersonne(new Personne());
	   a1.ajouterAffaireOuBagage(new Bagage(10.0,20.0));//10kg, 20 litres
	   a1.ajouterAffaireOuBagage(new Bagage(5.0,15.0));//5kg, 15 litres
	   a1.ajouterAffaireOuBagage(new Personne("carlos","Goshn","cg@renault.com",165));//poidsmoyen=70
	   a1.afficher();
	   a1.sauvegarder(); //+refresh sur projet eclipse pour voir le fichier généré avion.txt
	}
	
	public static void testRelectureAvion() {
		Avion a1Relu = new Avion();
		a1Relu.recharger(); //depuis le fichier avion.txt
		a1Relu.afficher();
	}
	
	public static void testCollection2() {
		//créer une liste de Integer ou Double
		List<Double> listeNumerique = new ArrayList<>();
		
		//ajouter quelques valeurs
		listeNumerique.add(12.0);
		listeNumerique.add(4.0);
		listeNumerique.add(8.0);
		
		Collections.sort(listeNumerique);
		
		//parcours la liste avec for() au sens forEach
		//à chaque itération , on affiche la valeur et le carré de la valeur
		for(Double val : listeNumerique) {
			System.out.println("le carre de " + val + " vaut " + val*val);
		}
		
		listeNumerique.remove(8.0);
		System.out.println("apres suppression de l'élément 8.0 ");
		System.out.println("taille de la liste = " + listeNumerique.size());
		for(Double val : listeNumerique) {
			//System.out.println("le carre de " + val + " vaut " + val*val);
			System.out.printf("le carre de %.2f  vaut %.2f\n" ,val,val*val);
		}
	}
	
	public static void testCollection3() {
		//créer une liste de références sur des Personne (ou des cas particulier : Employe)
		List<Personne> listePersonnes = new ArrayList<>();
		
		//ajouter quelques personnes
		listePersonnes.add(new Personne());
		listePersonnes.add(new Personne("didier","Defrance","didier@d-defrance.fr",182));
		listePersonnes.add(new Employe());
		
		//parcours la liste avec for() au sens forEach
		//à chaque itération , on affiche la valeur et le carré de la valeur
		for(Personne pers : listePersonnes) {
			System.out.println("pers=" + pers); //pers.toString()
		}
	}
	
	public static void testCollection() {
		//List liste = new ArrayList();
		List<String> liste = new ArrayList<>();
		liste.add("janvier");
		liste.add("fevrier");
		liste.add("mars");
		
		//parcours avec code proche d'un parcours de tableau ordinaire:
		int n = liste.size();
		System.out.println("n="+n);
		for(int i=0;i<n;i++) {
			Object obj = liste.get(i);
			System.out.println("obj="+obj);
		}
		
		//parcours avec un iterateur (années 2000-2005):
		Iterator it = liste.iterator();
		//Iterator<String> it = liste.iterator();
		while(it.hasNext()) {
			String valeur = (String)it.next();
			System.out.println("valeur="+valeur);
		}
		
		//parcours moderne avec boucle for() au sens forEach():
		for(String sVal : liste) {
			System.out.println("sVal="+sVal);
		}
	}
	
	public static void testException2() {
		Scanner reader = new Scanner(System.in);
		System.out.println("x:");
		double x = reader.nextDouble();
		double z=0.0;
		try {
			z = racineCarree(x);
		} catch (Exception e) {
			//e.printStackTrace();
			System.err.println("erreur:" + e.getMessage());
		}
		System.out.println("z=" + z);
	}
	
	public static void testException() {
		Scanner reader = new Scanner(System.in);
		System.out.println("x:");
		int x = reader.nextInt();
		System.out.println("y:");
		int y = reader.nextInt();
		int z=0;
		try {
			z = x / y;
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("division par 0 interdite");
		}
		System.out.println("x=" + x +  " y=" + y +  " z=" + z);
	}
	
	public static double racineCarree(double a) {
		if(a<0) throw new RuntimeException("racine carre imposible sur a negatif");
		return Math.sqrt(a);
	}

}
