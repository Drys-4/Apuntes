package evaluacion1;
//27 Loncircu
import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n;
		double circ;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inserte valor del radio:");	
		n = teclado.nextDouble();
		teclado.close();
		
		circ = 2 * Math.PI * n;
		
		System.out.println("El valor de la variable introducida es: " + circ);	
	
	}

}
