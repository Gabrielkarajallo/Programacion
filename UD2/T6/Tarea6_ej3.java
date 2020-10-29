package UD2.T6;

import java.util.Scanner;

public class Tarea6_ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un nunero");
        int num = teclado.nextInt();
        byte par;
        if (num % 2 == 0) {
            par = 1;
        } else {
            par = 0;
        }

        System.out.println("El valor de par es: " + par);
        int par1 = num % 2 == 0 ? 1 : 0;
        System.out.println("El valor de par es: " + par);
    }
}
