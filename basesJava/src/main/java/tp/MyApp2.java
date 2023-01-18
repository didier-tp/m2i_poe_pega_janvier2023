package tp;

import java.util.Scanner;

public class MyApp2 {


	public static void main(String[] args) {
		testException();

	}
	
	public static void testException() {
		Scanner reader = new Scanner(System.in);
		System.out.println("x:");
		int x = reader.nextInt();
		System.out.println("y:");
		int y = reader.nextInt();
		int z = x / y;
		System.out.println("x=" + x +  " y=" + y +  " z=" + z);
	}

}
