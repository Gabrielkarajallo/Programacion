package UD2.T8;
//Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.
public class Tarea8_ej11 {
    public static void main(String[] args) {
        for (int tabla = 1; tabla <= 10; ++tabla) {
            System.out.println("");
            System.out.println("Tabla de " + tabla);
            for (int i = 1; i <= 10; ++i) {
                System.out.println(tabla + "x" + i + " = " + tabla * i);
            }
        }
    }
}
