package UD2.T6;

import java.util.Scanner;

public class Tarea6_ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero ");
        byte num1 = teclado.nextByte();
        System.out.println("Dime otro numero ");
        byte num2 = teclado.nextByte();
        byte menor;
        if (num1 > num2) {
            menor = num2;
        } else {
            menor = num1;
        }

        System.out.println("El valor menor es: " + menor);
        menor = num1 > num2 ? num2 : num1;
        System.out.println("El valor menor es: " + menor);
    }
}
