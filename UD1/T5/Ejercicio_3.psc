Proceso Ejercicio_3
	Definir num1, num2, resultado Como Entero
	Escribir "Se generan dos numeros al azar: "
	num1 <- azar(101)
	num2 <- azar(101)
	
	Escribir num1
	Escribir num2 
	Escribir "Calcula la suma de los dos numeros generados!"
	leer resultado
	
	mientras resultado <> num1 + num2 hacer
		Escribir "Incorrecto! intente de nuevo"
		leer resultado
		si resultado = num1 + num2 Entonces
			Escribir "Correcto!!"
		FinSi
	FinMientras
FinProceso
