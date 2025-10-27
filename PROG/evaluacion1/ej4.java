package evaluacion1;
//29 cube
import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int cu;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inserte valor:");	
		n = teclado.nextInt();
		teclado.close();
		
		cu = n * n * n;
		
		System.out.println("El valor de la variable introducida es: " + cu);	
	
	}

}
