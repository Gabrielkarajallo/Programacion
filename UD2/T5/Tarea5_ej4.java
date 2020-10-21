package UD2.T5;
//Crea un programa que pida al usuario dos números enteros y cuántos de ellos son pares.
import java.util.Scanner;
public class Tarea5_ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos numeros");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("Los dos numeros son pares");
        } else {
            if (num1 % 2 != 0 && num2 % 2 != 0) {
                System.out.println("Los dos numeros son impares");
            } else {
                if (num1 % 2 == 0 && num2 % 2 != 0) {
                    System.out.println("El primer numero es par");
                } else {
                    if (num1 % 2 != 0 && num2 % 2 == 0) {
                        System.out.println("El segundo numero es par");
                    }
                }
            }
        }
    }
}
