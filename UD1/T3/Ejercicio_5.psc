Proceso Ejercicio_5
	Definir num1, num2 Como Entero
	Escribir "Dime un numero"
	leer num1
	Escribir "Dime otro numero"
	leer num2 
	
	si num1 > 0 y num2 > 0 entonces 
		Escribir "La division de los dos numeros es " num1 / num2
	SiNo
		si num1 > 0 y num2 <= 0 Entonces
			Escribir "No se puede hacer la division"
		sino
			si num1 <= 0 y num2 <= 0 Entonces
				Escribir "No se puede hacer la division"
			FinSi
		FinSi
	FinSi
FinProceso
