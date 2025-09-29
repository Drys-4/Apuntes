Proceso segundoi
	Definir h Como real;
	Definir m Como Real;
	Definir s Como Real;
	Escribir "Introduce la hora:";
	LEER h;
	Escribir "Introduce los minutos:";
	LEER m;
	Escribir "Porultimo introduce los segundos:";
	LEER s;
	
si (h > 24) Entonces
	Escribir "caracter no valido";
SiNo
	si (s >= 59) Entonces
		s <- 0;
		m <- m + 1;
		si (m >= 59) Entonces
			m <- 0;
			h <- h + 1;
		FinSi	
	SiNo
		s <- s + 1;
	FinSi
	
	Escribir "Hora: ", h, "h ", m, "m ", s, "s";
FinSi
FinProceso
