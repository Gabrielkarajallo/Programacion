Proceso Ejercicio_1
	Definir num Como Entero
	Escribir  "Introduce la contrase�a"
	leer num
		Mientras num <> 1234 hacer 
			Escribir "Contrase�a incorrecta"
			leer num
			si num = 1234 Entonces
				Escribir "Bienvenido"
			fin si
		FinMientras
FinProceso
