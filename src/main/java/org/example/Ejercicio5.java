package org.example;

import java.text.Normalizer;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba una palabra en minúsculas y sin acentos, y después #:");
        String palabra = scanner.nextLine();

        String p1 = Normalizer.normalize(palabra, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "")
                .toLowerCase();

        if (!p1.endsWith("#")) {
            throw new IllegalArgumentException("La palabra debe terminar con #");
        }

        String p2 = new StringBuilder(p1.substring(0, p1.length() - 1))
                .reverse()
                .toString();
        String mensaje = p1.substring(0, p1.length() - 1).equals(p2)
                ? p1.substring(0, p1.length() - 1) + " es un palíndromo"
                : p1.substring(0, p1.length() - 1) + " no es un palíndromo";
        System.out.println(mensaje);
    }
}