// EL USUARIO INTRODUCE UN NUNERO OBLIGATORIO ENTRE 0 y 100 , el programa  debe generar 
//un numero al azar entre 0 y el numero elegido por el usuario
// y preguntara al usuario, que numero ha elegido la maquina

//y se le dara las siguientes pistas :

//1. Si el numero esta cerca o lejos (  con 5 numeros de diferencia )
//2. Y si es mayor o menor el numero que ha dicho el usuario 

// Hasta Que adivine el numero

Algoritmo Juego
	Definir numero_usuario como Numerico
	
	Escribir "Tienes que decir un numero del 1 al 100"
	Leer numero_usuario
	
	Segun numero_usuario Hacer
		numero_usuario < 100 :
			Escribir "Escribe un numero valido"
		De Otro Modo:
		numero_usuario > 100 :
			Escribir "Escribe un numero valido"
	Fin Segun
	
//		Mientras numero_usuario > 100 Hacer
//			Escribir "Escribe un numero valido"
//		Fin Mientras 
		
FinAlgoritmo


