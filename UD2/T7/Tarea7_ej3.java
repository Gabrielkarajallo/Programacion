package UD2.T7;
//Realiza un programa que genere una letra minúscula de forma aleatoria. Investiga el uso de la función Math.random().
// Investiga también sobre el sistema de codificación ASCII y ten en cuenta que las letras minúsculas se corresponden con los números del 97 al 122.
import java.util.Scanner;
public class Tarea7_ej3 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println(Math.random()* 97 +122);
    }
}
