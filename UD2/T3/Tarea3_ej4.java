package UD2.T3;
//Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) y calcule su equivalencia en kilómetros,
// usando datos de tipo float (1 milla = 1.609 km).
import java.util.Scanner;
public class Tarea3_ej4 {
    public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
        float longitud;
        System.out.print("Introduce la longitud en millas: ");
        longitud = teclado.nextFloat();
        System.out.println("La longitud en metros es: " + longitud * 1609 + " m");
    }
}
