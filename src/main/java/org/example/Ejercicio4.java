package org.example;

import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> votos = new HashMap<String, Integer>();

        String[] candidatos = {"Emilia Terreros", "Gerardo Escodar", "María Aguaviva", "Nadia Letux"};

        for (String candidato : candidatos) {
            votos.put(candidato, 0);
        }

        int votosT = 0;
        boolean votacionFin = false;

        while (!votacionFin) {

            for (int i = 0; i < candidatos.length; i++) {
                System.out.println((i + 1) + " - " + candidatos[i]);
            }

            System.out.println("Ingrese su voto (1-" + candidatos.length + ")");

            String entrada = sc.nextLine();

            if (entrada.equals("68753421")) {
                votacionFin = true;
                break;
            }

            try {
                int voto = Integer.parseInt(entrada);
                if (voto >= 1 && voto <= candidatos.length) {
                    String candidatoVotado = candidatos[voto - 1];
                    votos.put(candidatoVotado, votos.get(candidatoVotado) + 1);
                    votosT++;
                    System.out.println("Ha votado por " + candidatoVotado);
                } else {
                    System.out.println("Ingrese un número válido");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido");
            }
        }

        System.out.println("Resultados:");

        double sumaPorcentajes = 0.0;
        for (String candidato : candidatos) {
            int votosCandidato = votos.get(candidato);
            double porcentaje = (double) votosCandidato / votosT * 100;
            if (porcentaje > 100.0) {
                porcentaje = 100.0;
            }
            sumaPorcentajes += porcentaje;
            System.out.println(candidato + ": " + porcentaje + " %");
        }

    }
}