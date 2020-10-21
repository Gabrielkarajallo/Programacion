package UD2.T5;
//Crea un programa que pida un número entero al usuario y diga si es positivo (mayor que cero) o si, por el contrario, no lo es (usando "else").
import java.util.Scanner;
public class Tarea5_ej1 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Introduce un numero");
        num = teclado.nextInt();

        if (num > 0){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero es negativo");
        }
    }
}
