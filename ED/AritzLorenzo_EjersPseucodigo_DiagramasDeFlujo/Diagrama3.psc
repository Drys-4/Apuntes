Proceso Diagrama3
	definir n Como entero;
	Definir x Como Entero;
	
	Dimension n[3];
	n[0] <- 0;
	n[1] <- 0;
	n[2] <- 0;
	
	Escribir "Inserte numero negativo o positivo:";
	Leer n[0];
	Escribir "Inserte numero negativo o positivo:";
	Leer n[1];
	Escribir "Inserte numero negativo o positivo:";
	Leer n[2];
	
	Si (n[0] < 0) Entonces
		x <- n[0] * 3;
	SiNo
		si (n[0] >= 0) Entonces
			x <- n[0] + n[1] + n[2];
		FinSi
	FinSi
	Escribir x;
FinProceso
