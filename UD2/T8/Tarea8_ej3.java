package UD2.T8;
//Realizar un aplicación que genere un número aleatorio entre 1 y 100. El jugador debe ir probando números tratando de acertarlo.
// El programa debe indicar "mayor" o "menor" según el número secreto sea mayor o menor que el introducido por el usuario.
// El proceso finaliza cuando el usuario acierta o cuando se rinde (introduciendo un -1).
import java.util.Random;
import java.util.Scanner;
public class Tarea8_ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = (int) ((Math.random() * 100)+1); // Número aleatorio de 1 a 100.
        int numero_usuario;
        int i; // Contador para bucle for.
        System.out.println("Averiguar un número secreto de 100 posibles.");
        System.out.print("5 intentos. Escribe un número entre 1 y 100: ");
        numero_usuario = teclado.nextInt();
        for (i=0; i<=4; i++) {
            if (numero == numero_usuario) {
                System.out.println("¡Has acertado!");
                break; }
            else if (i == 4) {
                System.out.println("Has perdido. El número era el: " + numero);
                break; }
            else if (numero >numero_usuario)
                System.out.println("El número secreto es MAYOR que " + numero_usuario);
            else if (numero < numero_usuario)
                System.out.println("El número secreto es MENOR que " + numero_usuario);
            if (i <=1) {
                System.out.print("Otro intento: ");
                numero_usuario = teclado.nextInt(); }
            else if (i ==2) {
                int x = (int) (numero/10);
                System.out.print("Otro intento: ");
                numero_usuario = teclado.nextInt(); }
            else if (i >= 3) {
                System.out.print("ÚLTIMO intento: ");
                numero_usuario = teclado.nextInt(); }
        }
    }
}
