Proceso Ejercicio_3
	Definir num1, num2 Como Entero
	Escribir "Introduce dos numeros"
	leer num1
	leer num2
	
	Repetir
		si num2 = 0 Entonces
			Escribir "El segundo numero no puede ser cero, intenta de nuevo"
			leer num1
			leer num2
		FinSi
	Hasta Que num2 <> 0 
	Escribir num1 / num2
	
FinProceso
