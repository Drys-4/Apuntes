Proceso NUMPRIMO
	Definir n Como Entero;
	Definir prim Como Entero;
	Definir i Como logico;
	
	prim <- 2;
	i <- verdadero;
	
	Escribir "Iserte valor:";
	Leer n;
	Mientras (prim < n) y (i) Hacer
		si (n mod prim == 0) Entonces
			i <- falso;
		FinSi
			prim <- prim + 1;
	FinMientras
	
	si (i) Entonces
		Escribir "El ",n," es Primo";
	SiNo
		Escribir "El ",n," No es Primo";
	FinSi
FinProceso
