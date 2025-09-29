Proceso Maximini
	Definir numer Como Entero;
	Definir n Como Entero;
	Definir max Como Entero;
	Definir min Como Entero;
	
	n <- 0;
	max <- 0;
	min <- 9999;
	
	Mientras (n >= 0) Hacer
		Escribir "Insete valor:";
		leer n;
		numer <- n;
		si (numer >= 0) Entonces
			si (numer > max) Entonces
				max <- numer;
			FinSi
			si (numer < min) Entonces
				min <- numer;
			FinSi
		FinSi

		Escribir "Maximo: ",max," Minimo: ",min;
	FinMientras
FinProceso
