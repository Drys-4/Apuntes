Proceso NXN
	Definir N Como real;
	Definir s Como Real;
	Definir c Como Entero;
	Escribir "Introduce una cantidad:";
	LEER N;
	s <- n * n;
	si (s >= 100) Entonces
		c <- s - 100;
		Escribir "El cuadrado de ", n, " es ", s, " y ", c, " pasa de 100";
	SiNo
		si (s <= 100) Entonces
			c <- 100 - s;
			Escribir "El cuadrado de ", n, " es ", s, " y hasta 100 faltan ", c;
		FinSi
	FinSi
FinProceso
