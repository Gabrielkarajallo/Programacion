Proceso Ejercicio_2
	Definir  num1, num2 Como Entero
	Escribir  "Dime dos numeros pares"
	leer num1
	leer num2
	
	mientras num1 <> 0 y num2 <> 0 hacer 
		Escribir  "La suma de los numeros es: " num1 + num2
		Escribir "Introduce dos numeros nuevamente"
		leer num1
		leer num2
		si num1 = 0 y num2 = 0 Entonces
			Escribir "Fin"
		FinSi
	FinMientras
	
FinProceso
