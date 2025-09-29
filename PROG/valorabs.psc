Algoritmo valorabs
	Definir N Como real;
	Definir s Como real;
	Escribir "Introduce un valor:";
	LEER N;
	si (n < 0) Entonces
		s <- -n;
	SiNo
		s <- n;
	FinSi
	Escribir "Valor adsoluto de ", n, " es ", s;
FinAlgoritmo
