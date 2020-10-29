package UD2.ENTREGABLE;
//Dada una cadena mostrar por pantalla la cantidad de espacios, haches y vocales
//abiertas tiene, independientemente de que sean mayúsculas, minúsculas o acentuadas.
//Las vocales abiertas son a, e, o.
import java.util.Scanner;
public class Ejercicio5 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        String palabra;
        System.out.print("Introduce la cadena: ");
        palabra = teclado.nextLine();
        int contador = 0;
        int cantidadDeEspacios = 0;
        int  contador_h=0;
        for(int x=0;x<palabra.length();x++) {
            if ((palabra.charAt(x)=='a') || (palabra.charAt(x)=='e') ||  (palabra.charAt(x)=='o')){
                contador++;
            }
        }
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == ' ') cantidadDeEspacios++;
        }
        for (int i= 0; i< palabra.length(); i++){
            if (palabra.charAt(i) == 'h') contador_h++;
        }
        System.out.println("La palabra " + palabra + "contiene " + contador + " vocales abiertas");
        System.out.println("La cantidad de espacios es: " + cantidadDeEspacios);
        System.out.println("La cantidad de h es: " + contador_h);
        System.out.print("La suma total: ");
        System.out.println((contador) + (cantidadDeEspacios) + (contador_h));
    }
}
