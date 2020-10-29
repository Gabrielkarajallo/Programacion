package UD2.T8;
//Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
import java.util.Scanner;
public class Tarea8_ej13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int aprobados=0;
        int suspensos=0;
        int condicionados=0;
        int nota;

        for (int i=1; i <7; i++){
            System.out.println("Nota del alumno " +i);
            nota=teclado.nextInt();
            if (nota == 4){
                condicionados++;
            }else if (nota >= 5){
                aprobados++;
            }else if (nota < 4){
                suspensos++;
            }
        }
        System.out.println("Los alumnos aprobados son: " + aprobados);
        System.out.println("Los alunos condicionados son: " + condicionados);
        System.out.println("Los alumnos suspensos son: " + suspensos);
    }
}
