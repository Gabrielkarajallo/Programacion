package UD2.T5;
//Crea un programa que pida tres números enteros largos al usuario y diga cuál es el mayor de los tres.
import java.util.Scanner;
public class Tarea5_ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce tres numeros largos");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.println("El mayor es " + num1);
        }else{
            if(num2 > num1 && num2 > num3){
                System.out.println("El mayor es " + num2);
            }else{
                if(num3 > num1 && num3 > num2){
                    System.out.println("El mayor es " + num3);
                }
            }
        }
    }
}
