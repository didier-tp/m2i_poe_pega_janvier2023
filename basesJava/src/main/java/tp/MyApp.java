package tp;

public class MyApp {

	public static void main(String[] args) {
		//testTypeElementaire();
		//testConversion();
		//testCercle();
		testPersonne();
	}
	
	public static void testPersonne() {
		Personne p1=null , p2=null;
		p1=new Personne();
		p1.prenom="alex"; p1.nom="Therieur" ; p1.email="alex.therieur@xyz.com";
		p1.taille=120; p1.grandir(5);
		System.out.println("p1=" + p1.toString());
		p2=new Personne();
		p2.prenom="axelle"; p2.nom="Aire" ; p2.email="axelle.Aire@xyz.com";
		p2.taille=130; p2.grandir(6);
		System.out.println("p2=" + p2);//.toString() implicite
	}
	
	public static void testCercle() {
		Cercle c1=null, c2=null;
		c1 = new Cercle();
		c1.rayon = 100; c1.xc = 50; c1.yc = 50;
		System.out.println("valeurs du c1=" + c1.toString());
		System.out.println("perimetre de c1="+ c1.perimetre());
		c2 = new Cercle();
		c2.rayon = 200; c2.xc = 60; c2.yc = 60;
		c2.zoomer(2);
		System.out.println("rayon de c2="+ c2.rayon);
		//System.out.println("valeurs du c2=" + c2.toString());
		System.out.println("valeurs du c2=" + c2); //avec appel implicite de .toString()
	}
	
	public static void testClasseEnveloppe() {
		int age1 = 25;
		//age1 = null; //null = valeur impossible sur int
		Integer age2 ;
		age2=25; //equivalent à écrire age2 = new Integer(25);
		age2=26; //équivalent à écrire age2 = new Integer(26);
		age2 = null; //null = valeur possible (et quelquefois par défaut) d'un Integer
		//la valeur null est pratique (et utile) : ça provient d'un null SQL 
		//ou d'une zone de saisie laissée à vide.
	}
	
	
	public static void testConversion() {
		String sA="5"; //sA est de type String (souvent après une saisie au clavier dans formulaire HTML)
		int a = Integer.parseInt(sA);
		String sB="6"; 
		int b = Integer.parseInt(sB);
		System.out.println("sA+sB="+ (sA + sB)); 
		System.out.println("a+b="+ (a + b)); 
		
		double x = Double.parseDouble(sA); // x vaut 5.0 ou 5
		double y ;
		y= a / b ; 
		System.out.println("y=a/b="+ y); //0 ou 0.0
		y = x / b ; 
		System.out.println("y=x/b="+ y); 
		
		//déclarer les variables z1 et z2 de type double.
		//convertir "2.6" en numérique et stocker ça dans z1;
		//convertir la valeur 2 en double et stocker ça dans z2
		//afficher le résultat de la multiplication de z1 par z2
		double z1,z2;
		z1=Double.parseDouble("2.6");
		z2 = (double) 2; //ou bien z2 = 2;
		double res= z1*z2;
		System.out.println("res=z1*z2=" + res);
		int resAsInt = (int) res;
		System.out.println("res (en int)=" + resAsInt);
	}
	
	public static void testTypeElementaire() {
		String sDate = "lundi 16 janvier 2023";
		//char ca = 'a';
		sDate=sDate.toUpperCase();
		System.out.println(sDate); 
		
		int a=5;
		int b=6;
		int c=a+b;
		System.out.println("c="+c);
		
		double x=2 , y=3.3;
		double z = x+y;
		System.out.println("z="+z);
	}

}
