package UD2.T3;
// Crea un programa que calcule y muestre la división de dos números reales de doble precisión introducidos por el usuario.

import java.util.Scanner;
public class Tarea3_ej3 {
    public static void main (String[] args){
        double num1, num2;
    Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos numeros ");
        num1 = teclado.nextDouble();
        num2 = teclado.nextDouble();
        System.out.println("La division de los dos numeros es: " + (num1 / num2));
    }
}
