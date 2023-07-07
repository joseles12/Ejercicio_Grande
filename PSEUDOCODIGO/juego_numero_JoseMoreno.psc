// EL USUARIO INTRODUCE UN NUNERO OBLIGATORIO ENTRE 0 y 100 , el programa  debe generar 
//un numero al azar entre 0 y el numero elegido por el usuario
// y preguntara al usuario, que numero ha elegido la maquina

//y se le dara las siguientes pistas :

//1. Si el numero esta cerca o lejos (  con 5 numeros de diferencia )
//2. Y si es mayor o menor el numero que ha dicho el usuario 

// Hasta Que adivine el numero

Algoritmo Juego
	
	// DEFINO LAS VARIABLES DE LOS NUMEROS USUARIO Y MAQUINA
	
	Definir numero_usuario como Numericos
	Definir numero_maquina como Numericos
	Definir numero_adivinado  como Numericos
	
	// LE PEDIMOS AL USUARIO QUE NOS DE UN NUMERO EN EL RANGO VALIDO
	
	Escribir "Tienes que indicar un numero del 1 al 100"
	Leer numero_usuario
	
	// USAMOS UN MIENTRAS QUE PARA VERIFICAR QUE EL NUMERO SEA MENOR A 100 
	//Y REPETIMOS HASTA QUE SEA MENOR A 100
	
	Mientras numero_usuario > 100 Hacer
				Repetir
					Escribir "Dime un numero en un rango valido entre 0 - 100 "
					Leer  numero_usuario
				Hasta Que numero_usuario <= 100;
	Fin Mientras 
	Escribir "El numero " numero_usuario " es valido para el juego "
	
	// SE GENERA MEDIANTE LA FUNCION AZAR UN NUEVO NUMERO USANDO COMO MAXIMO
	// EL QUE EL USUARIO HAYA DADO ANTES
	
	numero_maquina = azar (numero_usuario) 
	
	// SE LE PREGUNTA AL USUARIO POR EL NUMERO HASTA QUE LO ADIVINE
	// INDICANDO SI EL NUMERO ES MAYOR O MENOR DE LO QUE HA DICHO
	// Y SI ESTA A UNA DISTANCIA DE 5 NUMEROS 
	
	Escribir "Adivine cual es el numero que tiene la maquina elegiendo como maximo el  " numero_usuario
	leer numero_adivinado 
	
	Mientras numero_adivinado <> numero_maquina  Hacer
		        Repetir
					Escribir "El numero que has indicado no es el correcto"
								Si (numero_maquina - numero_adivinado) <= 5 Entonces
									Escribir "Estas a 5 numeros"
								SiNo
									Escribir "Aun te queda"
								Fin si
										Si numero_adivinado > numero_maquina Entonces
											Escribir "El numero que buscas es menor"
										SiNo
											Escribir "El numero que buscas es mayor"
										Fin Si
					Leer  numero_adivinado
				Hasta Que numero_adivinado = numero_maquina ;
	Fin Mientras 
	
	Escribir "Enhorabuena el numero que has indicado que era : " numero_adivinado 
	Escribir "Era el mismo de la maquina : " numero_maquina 
	
FinAlgoritmo





