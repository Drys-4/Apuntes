Algoritmo ExpenderCanv
	Definir n Como Real;
	Definir producto Como Cadena;
	Definir precio Como Real;
	Definir i Como Real;
	Definir opcion Como Entero;
	Definir can Como Entero;
	Definir c Como Entero;
	Definir x Como Entero;
	
	Dimension producto[4];
	producto[1] <- "Café";
	producto[2] <- "Refresco";
	producto[3] <- "Agua";
	
	Dimension precio[4];
	precio[1] <- 0.43;
	precio[2] <- 1.11;
	precio[3] <- 0.36;
	
	Dimensionar can[8];
	
	//Menú
	
	Escribir "introduzca cantidad";
	leer n;
	Escribir "Su saldo es de ",n,"$ seccione el producto del menu: ";
	Escribir "   /----------|-----------|----------\";
	escribir "  |    Café   |  Refresco |    Agua   |";
	escribir "  |    0,43$  |   1,11$   |   0,36$   |";
	Escribir "  |    [1]    |    [2]    |    [3]    |";
	Escribir "   \----------|-----------|----------/";
	leer opcion;
	
	//calculos con los datos
		
	Si (opcion >= 1) Y (opcion <= 3) Entonces
		Si (n >= precio[opcion]) Entonces
			i <- n - precio[opcion];
			Escribir "Su producto ",producto[opcion],". Gracias";
			Escribir "Canbio: ",i,"$";
		SiNo
			i <- precio[opcion] - n;
			Escribir "Saldo insuficiente, dinero faltante ",i,"$";
		FinSi
	SiNo
		Escribir "Opción incorrecta";
		Escribir "Canbio: ",n,"$";
	FinSi
	
	c <- trunc(i * 100);
	
	can[0] <- trunc(c / 200);
	c <- c mod 200;
	can[1] <- trunc(c / 100);
	c <- c mod 100;
	can[2] <- trunc(c / 50);
	c <- c mod 50;
	can[3] <- trunc(c / 20);
	c <- c mod 20;
	can[4] <- trunc(c / 10);
	c <- c mod 10;
	can[5] <- trunc(c / 5);
	c <- c mod 5;
	can[6] <- trunc(c / 2);
	c <- c mod 2;
	can[7] <- c;
	
	Escribir "Monedas: 2$ | 1$ | 50c | 20c | 10c | 5c | 2c | 1c";
	Escribir "Canbio:  ",can[0],"  | ",can[1],"  |  ",can[2],"  |  ",can[3],"  |  ",can[4],"  | ",can[5],"  | ",can[6],"  | ",can[7]," ";
FinAlgoritmo
