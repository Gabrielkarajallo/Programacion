Proceso Ejercicio_2
	definir num1, num2 Como Entero
	Escribir "Dime un numero"
	leer num1
	Escribir "Dime otro numero"
	leer num2 
	si EsMultiplo(num1,num2) Entonces
		Escribir num1, " es multiplo de " num2
	SiNo
		Si EsMultiplo(num2,num1) Entonces
			Escribir num2, " es multiplo de " num1
		FinSi
	FinSi
FinProceso


SubProceso resp <- EsMultiplo(num1, num2)
	si num1 % num2 == 0 entonces
		resp = Verdadero
	SiNo
		resp = Falso
	FinSi
FinSubProceso

