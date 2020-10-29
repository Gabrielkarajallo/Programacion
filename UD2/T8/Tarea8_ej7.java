package UD2.T8;
// Diseñar un programa que muestre el producto de los 10 primeros números impares.

public class Tarea8_ej7 {
    public static void main(String[] args){
        System.out.println("producto de los 10 primeros numeros impares");
        double producto = 1.0D;

        for(int i = 1; i < 10; i += 2) {
            producto *= (double)i;
        }

        System.out.println("El producto de los 10 primeros impares es de: " + producto);
    }
}
