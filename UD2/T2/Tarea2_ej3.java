package UD2.T2;
// Crea un programa que calcule y muestre la división de dos números enteros introducidos por el usuario.

import java.util.Scanner;
public class Tarea2_ej3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        System.out.println("Introduce dos numeros: ");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        System.out.print("La division de los dos numeros es: ");
        System.out.println(num1 / num2 );
    }
}
