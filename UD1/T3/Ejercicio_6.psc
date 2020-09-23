Proceso Ejercicio_6
	Definir num1, num2, num3 Como Entero
	Escribir "Dime tres numeros"
	Leer num1
	leer num2
	leer num3
	
	si num1 > num2 y num1 > num3 Entonces
		Escribir "El primer numero es el mayor"
	SiNo
		si num2 > num1 y num2 > num3 Entonces
			escribir "El segundo numero es el mayor"
		SiNo
			si num3 > num1 y num3 > num2 entonces 
				Escribir "El tercer numero es el mayor"
			SiNo
				Escribir "Los tres numeros son iguales"
			FinSi
		FinSi
	FinSi
	
FinProceso
