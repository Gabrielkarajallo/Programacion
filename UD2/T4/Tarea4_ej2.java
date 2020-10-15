package UD2.T4;
//Necesitamos una aplicación que calcule la media aritmética de dos notas enteras. Hay que tener en cuenta que la media puede contener decimales.
import java.util.Scanner;
public class Tarea4_ej2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        float nota1, nota2;
        System.out.println("Introduce dos notas enteras");
        nota1 = teclado.nextFloat();
        nota2 = teclado.nextFloat();
        System.out.println("La media de las dos notas es: " + ( (nota1+nota2) /2) );
    }
}
