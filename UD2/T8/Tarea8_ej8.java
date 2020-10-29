package UD2.T8;
//Pedir un número y calcular su factorial.
import java.util.Scanner;
public class Tarea8_ej8 {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = teclado.nextInt();
        int factorial = 1;
        for (int i = num; i > 0; i--){
           factorial *= i;
        }
        System.out.println("El factorial del numero es: " + factorial);
    }
}
