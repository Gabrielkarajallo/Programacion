package UD2.T8;
//Un centro educativo nos ha pedido que diseñemos una aplicación para calcular datos estadísticos de los alumnos.
// Se introducirán las edades de los elumnos hasta que una de ellas sea negativa. La aplicación mostrará la suma de las edades,
// la media, de cuántos alumnos hemos introducido su edad, y cuántos alumnos son mayores de edad.
import java.util.Scanner;
public class Tarea8_ej2 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int sumaEdades = 0;
        int media;
        int numeroAlumnos = 0;
        int mayorEdad = 0;
        int edad;
        do {
            System.out.println("Dime la edad del alumno");
            edad = teclado.nextInt();
            if (edad >= 0) {
                ++numeroAlumnos;
                sumaEdades += edad;
            }
            if (edad > 18) {
                ++mayorEdad;
            }
        } while(edad > 0);
       media = sumaEdades / numeroAlumnos;
        if (numeroAlumnos > 0) {
            System.out.println("El numero de alumnos es: " + numeroAlumnos);
            System.out.println("La suma de todas las edades es: " + sumaEdades);
            System.out.println("La media es: " + media);
            System.out.println("Los alumnos mayores de edad son: " + mayorEdad);
        }
    }
}
