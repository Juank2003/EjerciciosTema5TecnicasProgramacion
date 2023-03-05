package org.example;

import java.util.Scanner;

public class Ejercicio9 {
    private static char[][] tablero = new char[3][3];
    private static char jugadorActual = 'X';

    public static void main(String[] args) {
        inicializarTablero();


        while (!hayGanador() && !hayEmpate()) {
            mostrarTablero();
            System.out.println("Jugador " + jugadorActual + ", introduce las coordenadas:");
            int fila = pedirCoordenada("fila");
            int columna = pedirCoordenada("columna");

            // Comprobamos que la casilla está libre
            if (tablero[fila][columna] == ' ') {
                tablero[fila][columna] = jugadorActual;
                cambiarJugador();
            } else {
                System.out.println("Casilla ocupada, elige otra.");
            }
        }

        // resultado
        mostrarTablero();
        if (hayGanador()) {
            System.out.println("¡Jugador " + jugadorActual + " gana!");
        } else {
            System.out.println("¡Empate!");
        }
    }


    private static void inicializarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    private static void mostrarTablero() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  -----");
            }
        }
    }

    private static int pedirCoordenada(String coordenada) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la " + coordenada + " (0, 1 o 2): ");
        int valor = scanner.nextInt();
        while (valor < 0 || valor > 2) {
            System.out.print("Valor incorrecto. Introduce la " + coordenada + " (0, 1 o 2): ");
            valor = scanner.nextInt();
        }
        return valor;
    }

    private static void cambiarJugador() {
        if (jugadorActual == 'X') {
            jugadorActual = 'O';
        } else {
            jugadorActual = 'X';
        }
    }

    private static boolean hayGanador() {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) {
                return true;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (tablero[0][i] == jugadorActual && tablero[1][i] == jugadorActual && tablero[2][i] == jugadorActual) {
                return true;
            }
        }

        if (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) {
            return true;
        }
        if (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual) {
            return true;
        }

        return false;
    }
    private static boolean hayEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}