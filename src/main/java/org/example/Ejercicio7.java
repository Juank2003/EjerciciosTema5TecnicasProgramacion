package org.example;
import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {
        char[][] tabla = new char[20][30];
        Random random = new Random();

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = (char) (random.nextInt(26) + 'a');
            }
        }

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }
}