Proceso PRIMO100
	Definir n Como Entero;
	Definir prim Como Entero;
	Definir i Como logico;
	Definir num Como Entero;
	
	Escribir "1";
	Escribir "2";
	n <- 3;
	num <- 2;
	
	Mientras (num <= 100) Hacer
		si (n mod 2 == 0) Entonces
			i <- Falso;
		sino
			prim <- 3;
			i <- Verdadero;
		FinSi
		
		Mientras (prim < n) y (i) Hacer
			si (n mod prim == 0) Entonces
				i <- falso;
			FinSi
			prim <- prim + 2;
		FinMientras
		
		si (i) Entonces
			Escribir n;
		FinSi
		n <- n + 1;
		num <- num + 1;
	FinMientras
FinProceso
