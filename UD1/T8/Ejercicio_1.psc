Funcion EscribirCentrado (texto)
	definir i Como Entero
	definir numero_espacios Como Real
	numero_espacios <- redon (40 - longitud(texto)/2);
	para i <- 0 hasta numero_espacios Con Paso 1 hacer 
		Escribir sin saltar " " 
	FinPara
FinFuncion

Proceso Ejercicio_1
	EscribirCentrado("Textocentrado")
	Escribir "texto centrado"
FinProceso
