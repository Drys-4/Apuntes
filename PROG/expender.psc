Algoritmo Expender
	Definir n Como Real;
	Definir producto Como Cadena;
	Definir precio Como Real;
	Definir i Como Real;
	Definir opcion Como Entero;
	
	Dimension producto[3];
	producto[0] <- "Café";
	producto[1] <- "Refresco";
	producto[2] <- "Agua";
	
	Dimension precio[3];
	precio[0] <- 0.43;
	precio[1] <- 1.11;
	precio[2] <- 0.36;

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
FinAlgoritmo
