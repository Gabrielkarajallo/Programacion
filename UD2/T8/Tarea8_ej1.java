package UD2.T8;
//Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si es positivo, y su cuadrado.
// El proceso terminará cuando el número introducido por teclado sea 0.
import java.util.Scanner;
public class Tarea8_ej1 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = teclado.nextInt();

        while (num != 0){
            if (num %2==0 && num >= 0){
                System.out.println("El numero es par, es positivo y su cuadrado es: " + num*num );
                break;
            }else{
                if (num %2!=0 || num < 0){
                    System.out.println("El numero no es par o es negativo.");
                    break;
                }
            }
        }
    }
}

