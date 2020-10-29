package UD2.T8;
//Un centro de investigación de la flora urbana necesita una aplicación que muestre cual es el árbol más alto.
// Para ello se introducirán por teclado las alturas en cms de cada árbol, terminando cuando se introduzca -1.
// Los árboles se identifican mediante etiquetas con números correlativos, comenzando en 0.
import java.util.Scanner;
public class Tarea8_ej9 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int etiqueta = 0;
        int altura_arbol;
        int etiqueta_arbol_mas_alto = 0;
        int arbol_mas_alto;
        do {
            System.out.print("Árbol con etiqueta: " + etiqueta + ", Introduce su altura: ");
            altura_arbol = teclado.nextInt();
            arbol_mas_alto = altura_arbol;
            if (altura_arbol > arbol_mas_alto ){
                arbol_mas_alto = altura_arbol;
                etiqueta_arbol_mas_alto = etiqueta;
            }
            etiqueta++;
        }while (altura_arbol != -1);
        System.out.println("El árbol más alto mide: " + arbol_mas_alto);
        System.out.println("Su etiqueta correspondiente es: " + etiqueta_arbol_mas_alto);
        }
    }

