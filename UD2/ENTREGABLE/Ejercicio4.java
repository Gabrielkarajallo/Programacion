package UD2.ENTREGABLE;
//Escribe un programa que pida un número entero positivo por teclado y que
//muestre a continuación los 5 números consecutivos a partir del número
//introducido (incluyendo él mismo). Al lado de cada número se debe indicar
//si se trata de un primo o no.
import java.util.Scanner;
public class Ejercicio4 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int contadorPrimos = 0;
        System.out.println("Escribe un numero: ");
        int n = teclado.nextInt();
        for(int i = n; i <= n+5; ++i) {
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
        System.out.println("Desde " + n + " hasta sus 5 numeros consecutivos hay " + contadorPrimos + " numeros primos.");
    }
}
