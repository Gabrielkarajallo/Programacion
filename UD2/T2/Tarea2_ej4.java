package UD2.T2;
// Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) y calcule su equivalencia en metros (1 milla = 1609 m).
import java.util.Scanner;
public class Tarea2_ej4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println(" Calcular longitud: ");
        System.out.print(" Introduce un numero: ");
        num = teclado.nextInt();
        System.out.println("La longitud en metros es " + num * 1609 + " m");
    }
}

