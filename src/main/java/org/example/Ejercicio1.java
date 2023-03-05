package org.example;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = new int[11];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 10 - i;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(" " + numeros[i]);
        }
    }
}
