//Crea una funci�n EsPar que devuelva el valor l�gico "verdadero" o "falso" seg�n si el n�mero que se indique como par�metro es par o no lo es.
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



