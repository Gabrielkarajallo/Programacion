package UD2.T8;
//Desarrollar un programa que solicite los valores mínimo y máximo de un rango.
// A continuación, solicitará por teclado un valor que debe estar dentro del rango.
// Si no es asi, volverá a solicitar un número, y así repetidas veces hasta que el valor esté dentro del rango.
import java.util.Scanner;
public class Tarea8_ej5 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int valor_minimo, valor_maximo, num_usuario;
        System.out.println("Introduce el valor mínimo y máximo del rango:");
        System.out.print("Valor mínimo: ");
        valor_minimo = teclado.nextInt();
        System.out.print("Valor máximo: ");
        valor_maximo = teclado.nextInt();

        do {
            System.out.print("Introduce un valor que esté dentro del rango: ");
            num_usuario = teclado.nextInt();
            if (num_usuario >= valor_minimo && num_usuario <= valor_maximo){
                System.out.println("Correcto!");
                }
            }
        while(num_usuario < valor_minimo || num_usuario > valor_maximo);
    }
}
