package UD2.T5;
//Crea un programa que diga si el número introducido por el usuario es impar o no lo es.
import java.util.Scanner;
public class Tarea5_ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = teclado.nextInt();
        if (num %2==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero no es par");
        }
    }
}
