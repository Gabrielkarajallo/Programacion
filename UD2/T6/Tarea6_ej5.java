package UD2.T6;

import java.util.Scanner;

public class Tarea6_ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menu = 1;
        System.out.println("Dime el valor del radio de la circunsferencia");
        float radio = teclado.nextFloat();
        switch(menu) {
            case 1:
                System.out.print("Diametro es igual a ");
                System.out.println(2.0F * radio);
            case 2:
                System.out.print("Perimetro es igual a ");
                System.out.println(6.283185307179586D * (double)radio);
            case 3:
                System.out.print("Area es igual a ");
                System.out.println(3.141592653589793D * (double)radio * (double)radio);
            default:
        }
    }
}
