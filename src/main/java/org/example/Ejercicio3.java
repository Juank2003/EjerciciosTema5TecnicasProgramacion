package org.example;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<>();
        double suma = 0;
        int numNotas = 0;

        System.out.println("Introduzca la nota (-1 para terminar):");

        double nota = sc.nextDouble();

        while (nota != -1) {

            notas.add(nota);
            suma += nota;
            numNotas++;

            System.out.println("Introduzca la nota (-1 para terminar):");

            nota = sc.nextDouble();
        }

        double media = numNotas == 0 ? 0 : suma / numNotas;

        System.out.print("Las notas introducidas son: ");
        for (Double n : notas) {
            System.out.print(n + "; ");
        }

        System.out.println("\nLa media de las notas es " + media + ".");
    }
}

