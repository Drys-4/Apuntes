package evaluacion1;

import java.util.Scanner;

public class ej2 {

		public static void main(String[] args) {
			char c;
			
			Scanner teclado = new Scanner(System.in);
			System.out.println("Inserte valor:");	
			c = teclado.nextLine().charAt(0);
			teclado.close();
			
			System.out.println("El valor de la variable es " + c);	
		}

}
