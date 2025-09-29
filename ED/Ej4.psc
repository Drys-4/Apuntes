Proceso Ej4
	Definir n Como Entero;
	Definir a Como Entero;
	Definir b Como Entero;
	//Definir S Como Entero;
	n <- 0;
	a <- 2;
	b <- 100;
	//n <- 100 / 2;
	//s <- n * (n + 1);
	
	Mientras a <= b Hacer
		si a mod 2 = 0 Entonces
			n <- n + a;
		FinSi
		a <- a + 1;
	FinMientras
	Escribir "resulado: ", n;
FinProceso
