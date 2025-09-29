Proceso Diagrama1
	definir n Como real;
	definir nota Como entero;
	
	Dimension nota[3];
	nota[0] <- 0;
	nota[1] <- 0;
	nota[2] <- 0;
	
	Escribir "Nota 1º evaluacion:";
	Leer nota[0];
	Escribir "Nota 2º evaluacion:";
	Leer nota[1];
	Escribir "Nota 3º evaluacion:";
	Leer nota[2];
	
	n <- (nota[0] + nota[1] + nota[2]) / 3;
	
	Escribir "nota: ",n;
	Si (n >= 0) Y (n <= 10) Entonces
		si (n >= 5) Entonces
			Escribir "Aprobado";
		SiNo
			Escribir "Suspendido";
		FinSi
	FinSi
	
FinProceso
