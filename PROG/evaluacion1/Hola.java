package evaluacion1;

import java.util.Scanner;

public class Hola {

	public static void main(String[] args) {
		Double n;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inserte valor:");	
		n = teclado.nextDouble();
		teclado.close();
		
		System.out.println("El valor de la variable introducida es " + n);	
	}

}