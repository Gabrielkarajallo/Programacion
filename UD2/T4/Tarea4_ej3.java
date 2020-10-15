package UD2.T4;
//Modificar el ejercicio anterior para que muestre la parte entera de la media de tres notas decimales.
import java.util.Scanner;
public class Tarea4_ej3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        float nota1, nota2;
        System.out.println("Introduce dos notas enteras");
        nota1 = teclado.nextFloat();
        nota2 = teclado.nextFloat();
        System.out.println("La media de las dos notas es: " + ( Math.round((nota1+nota2) /2) ) );
    }
}
