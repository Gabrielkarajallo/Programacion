package UD2.T7;
//Realiza un programa que dadas dos variables a y b, intercambie los valores de a y b.
import java.util.Scanner;
public class Tarea7_ej1 {
    public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
    int a, b, aux;
        System.out.print("Introduce el valor de a: ");
        a = teclado.nextInt();
        System.out.print("Introduce el valor de b: ");
        b = teclado.nextInt();
        System.out.println("Los valores que has introducido son: A= " + a + " y B= " + b );
        aux = a;
        a = b;
        b = aux;
        System.out.println("Los valores intercambiados son: A= " + a + " y B= " + b);
    }
}
