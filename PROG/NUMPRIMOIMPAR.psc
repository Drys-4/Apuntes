Proceso NUMPRIMOIMPAR
	Definir n Como Entero;
	Definir prim Como Entero;
	Definir i Como logico;
	
	si (n mod 2 == 0) Entonces
		si (n == 2) Entonces
			i <- Verdadero;
		SiNo
			i <- Falso;
		FinSi
	FinSi
	
	prim <- 3;
	i <- verdadero;
	
	Escribir "Iserte valor:";
	Leer n;
	Mientras (prim < n) y (i) Hacer
		si (n mod prim == 0) Entonces
			i <- falso;
		FinSi
			prim <- prim + 2;
	FinMientras
	
	si (i) Entonces
		Escribir "El ",n," es Primo";
	SiNo
		Escribir "El ",n," No es Primo";
	FinSi
FinProceso
