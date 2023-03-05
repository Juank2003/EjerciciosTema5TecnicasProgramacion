package org.example;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] contador = new int[10];

        int num;

        do {
            System.out.print("Introduzca un valor comprendido entre 0 y 9 o -1 para terminar: ");
            num = sc.nextInt();

            if (num >= 0 && num <= 9) {
                contador[num]++;
            }

        } while (num != -1);

        System.out.println("Cantidad de 0: " + contador[0]);
        System.out.println("Cantidad de 1: " + contador[1]);
        System.out.println("Cantidad de 2: " + contador[2]);
        System.out.println("Cantidad de 3: " + contador[3]);
        System.out.println("Cantidad de 4: " + contador[4]);
        System.out.println("Cantidad de 5: " + contador[5]);
        System.out.println("Cantidad de 6: " + contador[6]);
        System.out.println("Cantidad de 7: " + contador[7]);
        System.out.println("Cantidad de 8: " + contador[8]);
        System.out.println("Cantidad de 9: " + contador[9]);
    }
}