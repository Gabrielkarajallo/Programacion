package UD2.T8;

import java.util.Scanner;

//Pedir un número n y dibujar un triángulo rectángulo de n elementos de lado, utilizando para ello asteriscos (*). Por ejemplo, para n=4:
public class Tarea8_ej14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.print("Introduce un numero: ");
        n = teclado.nextInt();

        for (int fila = 1; fila <= n; fila++){
            for (int columna = fila; columna <= n; columna++){
                    System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
