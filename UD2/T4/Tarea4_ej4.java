package UD2.T4;
//Sería interesante disponer de un programa que pida como entrada un número decimal y lo muestre redondeando al entero más próximo.
// ej: 2,3 -> 2      4,8 -> 5
import java.util.Scanner;
public class Tarea4_ej4 {
    public static void main(String[] args){
        float num;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero decimal: ");
        num = teclado.nextFloat();
        System.out.println("El numero redondeado es: " + Math.round(num));
    }
}
