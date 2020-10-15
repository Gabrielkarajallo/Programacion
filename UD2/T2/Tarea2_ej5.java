package UD2.T2;
// Crea un programa que pida al usuario una temperatura en grados centígrados y calcule (y muestre) a cuántos grados Fahrenheit equivalen (F = 9*C/5 + 32).
import java.util.Scanner;
public class Tarea2_ej5 {
    public static void main(String[] args){
        int temperatura;
        int F;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la temperatura en grados centigrados: ");
        temperatura = teclado.nextInt();
        System.out.println("La temperatura equivale a " + (F = 9*temperatura/5 + 32) + " grados Fahrenheit.");
    }
}
