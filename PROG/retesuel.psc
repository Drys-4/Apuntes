Proceso retesuel
	Definir N Como real;
	Definir s Como Real;
	Definir c Como Real;
	Escribir "Introduce una cantidad:";
	LEER N;
	si (n < 1000) Entonces
		s <- n * 0.1;
		c <- n - s;
		Escribir "Tu sueldo es de ", n, "? y una retencion de 10%, total: ", c;
	SiNo
		si (n > 1000) Entonces
			s <- n * 0.14;
			c <- n - s;
			Escribir "Tu sueldo es de ", n, "? y una retencion de 14%, total: ", c;
		SiNo
			si (n == 1000) Entonces
				s <- n * 0.12;
				c <- n - s;
				Escribir "Tu sueldo es de ", n, "? y una retencion de 12%, total: ", c;
			FinSi
		FinSi
	FinSi
FinProceso
