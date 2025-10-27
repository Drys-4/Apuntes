package evaluacion1;
//31 EnteroReal
import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n;
		int e;
		double r;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inserte valor:");	
		n = teclado.nextDouble();
		teclado.close();
		
		e = trunc(n);
		r =  n - e;
		System.out.println("El valor de la real: " + r + "y de el entero:" + e);	
	
	}

	private static int trunc(double n) {
		return (int)n;
	}

}
