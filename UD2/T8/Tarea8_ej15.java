package UD2.T8;
//Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que sean primos.
// Un número primo es aquel que sólo es divisible por 1 y por él mismo.
import java.util.Scanner;
public class Tarea8_ej15{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contadorPrimos = 0;
        System.out.println("Escribe un numero: ");
        int n = teclado.nextInt();
        for(int i = 1; i <= n; ++i) {
            boolean primo = true;
            for(int j = 2; j <= i - 1 && primo; ++j) {
                if (i % j == 0) {
                    primo = false;
                }
            }
            if (primo) {
                ++contadorPrimos;
                System.out.println(i + " es primo");
            }
        }
        System.out.println("De 1 a " + n + " hay " + contadorPrimos + " numeros primos");

    }
}
