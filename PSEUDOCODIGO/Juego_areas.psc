Funcion CalculoAreas <- Areas (0)
	
Fin Funcion

// ALGORITMO DONDE HAYA UN MENU DE OPCIONES PARA :
//1. AREA RECTANGULO
//2. AREA CUADRADO 
//3. AREA TRIANGULO
//SEGUN LA OPCION ELEGIDA LE PEDIRA LOS DATOS PARA CALCULAR LA OPERACION ELEGIDA
// AL TERMINAR DEBEMOS INDICAR SI EL USUARIO QUIERE CALCULAR OTRO AREA O QUE FINALICE EL PROGRAMA 

Algoritmo juego_areas
	
	Definir opcion_usuario Como Numericos
	Definir salir Como Caracter
	
	Escribir "Introduzca un numero del 1 al 3 para calcular un area siendo : "
	Escribir "1. AREA CUADRADO "
	Escribir "2. AREA RECTANGULO"
	Escribir "3. AREA TRIANGULO"
	
	leer opcion_usuario
	
	Mientras opcion_usuario > 3 Hacer
		Repetir
			Escribir "Dime un numero valido para una operacion"
			Leer  opcion_usuario
		Hasta Que opcion_usuario <= 3
	Fin Mientras 
		
	Segun opcion_usuario Hacer
		
		1:
			Escribir "Ha elegido el area del cuadrado"
					Escribir "Indicame el primer lado del cuadrado para realizar el area"
					leer lado_cuadrado 
					Escribir "Indicame el segundo lado del cuadrado para realizar el area"
					leer lado_cuadrado_2
					area = lado_cuadrado * lado_cuadrado_2
					Escribir  "El area de tu cuadrado es " area
		2:
			Escribir "Ha elegido el area del rectangulo"
					Escribir "Indicame el largo cuadrado para realizar el area"
					leer largo_cuadrado
					Escribir "Indicame el ancho de tu cuadrado para realizar el area"
					leer ancho_cuadrado
					area = largo_cuadrado * ancho_cuadrado
					Escribir  "El area de tu cuadrado es " area
		3:
			Escribir "Ha elegido el area del triangulo"
					Escribir "Indicame la base de tu triangulo para realizar el area"
					leer base_triangulo
					Escribir  "Indicame la altura de tu triangulo para realizar el area"
					leer altura_triangulo
					area = (base_triangulo * altura_triangulo) / 2 
					Escribir  "El area de tu triangulo es " area
			Fin Segun
FinAlgoritmo


