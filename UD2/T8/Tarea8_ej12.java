package UD2.T8;
//Pedir 5 calificaciones de alumnos. El programa debe decir, al final, si hay algún suspenso o no lo hay.
// Nota: cuidado, si hay 2 suspensos, no debe decirlo dos veces.
import java.util.Scanner;
public class Tarea8_ej12 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int contador_nota = 1;
    int contador_suspensos = 0;
        while (contador_nota <=5){
            System.out.println("Nota: ");
            int nota = teclado.nextInt();
            contador_nota++;

            if (nota < 5){
               contador_suspensos++;
            }
        }
        System.out.println("Hay " + contador_suspensos + " suspensos");
    }
}
