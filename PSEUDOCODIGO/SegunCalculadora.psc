
Algoritmo Segun_Calculadora
	
	//LECTURA DE DATOS 
	
	Definir operacion Como Numerica
	Definir num1 Como Numerica
	Definir num2 Como Numerica
	
	Escribir " ¿Que operacion desea realizar eliga un numero del 1 al 4  ? "
	Leer operacion 
	
	Escribir " Introduzca el primer numero "
	Leer num1
	Escribir " Introduzca el primer numero "
	Leer num2
	
	// PROCESO 
	
	Segun operacion Hacer
		 1 :
			Escribir  "La suma es  " num1 + num2 
		 2 :
			Escribir  "La resta es  " num1 - num2 
		 3 :
			Escribir  "La multiplicacion  es  " num1 * num2 
		 4 :
			Escribir  "La division es  " num1 / num2 
		
		De Otro Modo:
		
			Escribir "No ha usado un numero de operacion valido"
			Leer operacion
			
	Fin Segun
	
	
FinAlgoritmo
