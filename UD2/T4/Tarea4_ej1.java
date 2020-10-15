package UD2.T4;
//El tipo short permite almacenar valores comprendidos entre -32768 y 32767. Realiza un programa que muestre si el rango
// de valores de un tipo se comporta de forma cíclica. Es decir, que muestre el valor máximo de una variable de tipo short,
// y muestre también qué ocurre si sumamos 1 a esa variable.

import java.util.Scanner;
public class Tarea4_ej1 {
    public static void main(String[] args){
        short num1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("El valor máximo de tipo short es 32767");
        System.out.println("Introduce el numero y sumamos 1 a ese valor...");
        num1 = teclado.nextShort();
        System.out.println(num1 + 1);
    }
}
