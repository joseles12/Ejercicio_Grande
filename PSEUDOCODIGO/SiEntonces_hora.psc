Algoritmo siEntonces_horaActual
	
	//Definir mensaje Como Caracter
	
	Definir nombre Como Caracter
	Escribir "Dime tu nombre"
	
	
	Leer nombre

	Si HoraActual() < (120000) Entonces
		
		//mensaje = "Buenos dias"
		
		Escribir "Buenos dias " , nombre
	SiNo
		
		//mensaje = "Buenos tardes"
		
		Escribir "Buenas tardes " , nombre
		
	Fin Si
	
	//Escribir mensaje , nombre
	
FinAlgoritmo


