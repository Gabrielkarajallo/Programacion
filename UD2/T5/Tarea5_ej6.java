package UD2.T5;
//Crea un programa que contenga una constante llamada gravedad=9,8, solicite al usuario el valor de "tiempo", y calcule y muestre la
// velocidad (velocidad=gravedad x tiempo). Nota: si el valor del tiempo es negativo o 0, se mostrará el mensaje "Tiempo incorrecto"
import java.util.Scanner;
public class Tarea5_ej6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float gravedad = (float) 9.8;
        int tiempo;
        System.out.println(" Gravedad = 9,8");
        System.out.print("Introduce el valor de tiempo: ");
        tiempo = teclado.nextInt();
        if (tiempo <= 0){
            System.out.println("Tiempo incorrecto");
        }else{
            System.out.println("La velocidad es igual a: " + gravedad * tiempo);
        }
    }
}
