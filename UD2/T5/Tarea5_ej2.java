package UD2.T5;
//Crea un programa que pida al usuario que introduzca el número 12. Después debe decirle si lo ha hecho correctamente o no.
import java.util.Scanner;
public class Tarea5_ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Introduce el numero 12");
        num = teclado.nextInt();
        if(num != 12){
            System.out.println("Numero incorrecto");
        }else{
            System.out.println("Correcto!!");
        }
    }
}
