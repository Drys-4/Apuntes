Proceso calcuiva
	Definir N Como real;
	Definir s Como Real;
	Escribir "Introduce una cantidad:";
	LEER N;
	si (n <= 20000) Entonces
		s <- n * 0.1;
		Escribir "El IVA de ", n, " es ", s, "?";
	SiNo
		si (n >= 20000) Entonces
			s <- n * 0.21;
			Escribir "El IVA de ", n, " es ", s, "?";
		FinSi
	FinSi
FinProceso
