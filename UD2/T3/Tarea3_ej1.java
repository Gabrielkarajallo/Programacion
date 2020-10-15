package UD2.T3;
// Crea un programa que calcule y muestre la suma de dos números de dos cifras (de tipo byte) que introduzca el usuario.
import java.util.Scanner;
public class Tarea3_ej1 {
    public static void main(String[] args){
        byte num1, num2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos numeros: ");
        num1 = teclado.nextByte();
        num2 = teclado.nextByte();
        System.out.print("La suma de los dos numeros es: " + (num1 + num2));
    }
}
