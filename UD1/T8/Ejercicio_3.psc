//Crea una función EsPar que devuelva el valor lógico "verdadero" o "falso" según si el número que se indique como parámetro es par o no lo es.
SubProceso resultado_es_par <- EsPar (numero)
	si num mod 2==0 entonces
		resultado_es_par <- verdadero
	sino 
		resultado_es_par <- falso
	FinSi
FinSubProceso

Proceso Ejercicio_3
	Escribir "Introduce un numero"
	leer num 
	
	si EsPar(num) Entonces
		Escribir "Es par"
	SiNo
		Escribir "Es impar"
	FinSi
FinProceso



