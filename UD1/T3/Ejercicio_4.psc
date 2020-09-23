Proceso Ejercicio_4
	Definir num1, num2 Como Entero
	Escribir "Dime dos numeros"
	leer num1
	leer num2
	
	si num1 > 0 y num2 < 0 Entonces
		Escribir "El primer numero es positivo"
	SiNo
		si num1 < 0 y num2 > 0 Entonces
			Escribir "El segundo numero es positivo"
		SiNo
			si num1 > 0 y num2 > 0 Entonces
				Escribir "Los dos numeros son positivos"
			SiNo
				Escribir "Los dos numeros son negativos"
			FinSi
		FinSi
	FinSi
	
FinProceso
