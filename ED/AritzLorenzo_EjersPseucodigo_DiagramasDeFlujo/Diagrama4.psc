Proceso Diagrama4
	Definir num Como Entero;
	Definir suma Como Entero;
	Definir digito Como Entero;
	
	suma <- 0;
	
	Escribir "Ingrese un número:";
	Leer num;
	
	Mientras (num > 0) Hacer
		digito <- num % 10;
		suma <- suma + digito;
		num <- Trunc(num / 10);
	FinMientras
	
	Escribir "La suma de los dígitos es: ", suma;
FinProceso
