package UD2.ENTREGABLE;
//Realiza un programa que pinte por pantalla un rombo hueco hecho con
//asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
//sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
//mensaje de error y volverlo a pedir hasta que sea correcto.
import java.util.Scanner;
public class Ejercicio1 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        boolean numeroCorrecto = false;
        int numFilasRombos;
        do {
            System.out.print("Introduce el número de filas (impar): ");
            numFilasRombos = teclado.nextInt();
            if(numFilasRombos>0 && numFilasRombos%2!=0){
                numeroCorrecto = true;
            }
        } while (!numeroCorrecto);
        System.out.println("");
        int numFilas = numFilasRombos/2 + 1;
        for(int altura=1;altura<=numFilas;altura++){
            for(int blancos=1;blancos<=numFilas-altura;blancos++){
                System.out.print(" ");
            }
            for(int asteriscos=1;asteriscos<=(2*altura)-1;asteriscos++){
                System.out.print("*");
            }
            System.out.println("");
        }
        numFilas--;
        for(int altura=1;altura<=numFilas;altura++){
            for(int blancos=1;blancos<=altura;blancos++){
                System.out.print(" ");
            }
            for(int asteriscos=1;asteriscos<=(numFilas-altura)*2 +1;asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
