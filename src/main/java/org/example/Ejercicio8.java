package org.example;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char[][] tablero = new char[4][4];
        int filaBarco = random.nextInt(4);
        int columnaBarco = random.nextInt(4);
        boolean barcoEncontrado = false;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tablero[i][j] = '?';
            }
        }

        while (!barcoEncontrado) {

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (i == filaBarco && j == columnaBarco && !barcoEncontrado) {
                        System.out.print('?');
                    } else {
                        System.out.print(tablero[i][j]);
                    }
                }
                System.out.println();
            }

            System.out.print("¿Qué fila? ");
            int fila = scanner.nextInt() - 1;
            System.out.print("¿Qué columna? ");
            int columna = scanner.nextInt() - 1;


            if (fila == filaBarco && columna == columnaBarco) {
                System.out.println("Tocado y hundido");
                barcoEncontrado = true;
            } else {
                System.out.println("Agua");
                tablero[fila][columna] = '-';
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == filaBarco && j == columnaBarco) {
                    System.out.print('~');
                } else {
                    System.out.print(tablero[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("¡Has ganado!");
    }
}