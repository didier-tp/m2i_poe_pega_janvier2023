package tp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MyApp2 {


	public static void main(String[] args) {
		//testException();
		//testException2();
		//testCollection();
		testCollection2();
	}
	
	public static void testCollection2() {
		//créer une liste de Integer ou Double
		List<Double> listeNumerique = new ArrayList<>();
		
		//ajouter quelques valeurs
		listeNumerique.add(4.0);
		listeNumerique.add(8.0);
		listeNumerique.add(12.0);
		
		//parcours la liste avec for() au sens forEach
		//à chaque itération , on affiche la valeur et le carré de la valeur
		for(Double val : listeNumerique) {
			System.out.println("le carre de " + val + " vaut " + val*val);
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
