package tp;

import java.util.Scanner;

public class MyApp2 {


	public static void main(String[] args) {
		//testException();
		testException2();
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
