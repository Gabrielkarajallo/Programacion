Proceso Ejercicio_1
	Definir num Como Entero
	Escribir  "Introduce la contraseña"
	leer num
		Mientras num <> 1234 hacer 
			Escribir "Contraseña incorrecta"
			leer num
			si num = 1234 Entonces
				Escribir "Bienvenido"
			fin si
		FinMientras
FinProceso
