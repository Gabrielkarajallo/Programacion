package UD2.T3;
//Crea un programa que pida al usuario su año de nacimiento y el año actual (usando datos de tipo short) y halle la diferencia de
// ambos para obtener su edad.
import java.util.Scanner;
public class Tarea3_ej2 {
    public static void main (String[] args){
        short año_nacimiento, año_actual;
        Scanner teclado  = new Scanner(System.in);
        System.out.print("Introduce tu año de nacimiento: ");
        año_nacimiento = teclado.nextShort();
        System.out.print("Introduce el año actual: ");
        año_actual = teclado.nextShort();
        System.out.println("La diferencia entre los años es: " + (año_actual - año_nacimiento));
    }
}
