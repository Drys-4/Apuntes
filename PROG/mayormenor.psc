Proceso mayormenor
	Definir a Como real;
	Definir b Como Real;
	Escribir "Introduce una cantidad:";
	LEER a;
	Escribir "Introduce una cantidad:";
	LEER b;
	si (a < b) Entonces
		Escribir a, " es menor que ", b;
	SiNo
		si (a > b) Entonces
			Escribir a, " es myor que ", b;
		SiNo
			si (a == b) Entonces
				Escribir a, " y ", b, " son iguales";
			FinSi
		FinSi
	FinSi
FinProceso
