package UD2.T7;
//Tenemos las variables enteras "edad", "nivel_de_estudios", e "ingresos". Necesitamos almacenar en la variable booleana "jasp" el valor:
//    verdadero. Si la edad es menor o igual a 28, el nivel de estudios es mayor que 3, y los ingresos superan los 28000 (euros).
//    falso. En caso contrario.
import java.util.Scanner;
public class Tarea7_ej2 {
    public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
    int edad, nivel_de_estudios, ingresos;
    boolean jasp;
        System.out.print("Introduce la edad: ");
        edad = teclado.nextInt();
        System.out.print("Introduce el nivel de estudios: ");
        nivel_de_estudios = teclado.nextInt();
        System.out.print("Introduce los ingresos: ");
        ingresos = teclado.nextInt();
        if(edad <= 28 && nivel_de_estudios >= 3 && ingresos > 28000){
            jasp = true;
            System.out.println(jasp);
        }else{
            jasp = false;
            System.out.println(jasp);
        }
    }
}
