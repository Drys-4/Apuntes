package evaluacion1;
//32 CentimosEuros
import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n; //cantidad
		int e; //euros
		int c; //centimos
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inserte valor:");	
		n = teclado.nextDouble();
		teclado.close();
		
		e = (int)n;
		c =  (int)((n - e) * 100);
		System.out.println("Tiene: " + e + "€ con " + c + "c");	
	
	}

}
