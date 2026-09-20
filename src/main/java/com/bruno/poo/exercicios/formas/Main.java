package com.bruno.poo.exercicios.formas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();

        formas.add(new Circulo(5));
        formas.add(new Triangulo(3, 4, 5));
        formas.add(new Retangulo(6, 4));
        formas.add(new Quadrado(7));

        System.out.println("===== INFORMAÇÕES DAS FORMAS =====\n");

        for (Forma forma : formas) {
            forma.exibirInformacoes();
        }

        double areaTotal = 0;
        for (Forma forma : formas) {
            areaTotal += forma.calcularArea();
        }
        System.out.printf("Soma das áreas de todas as formas: "+ areaTotal);
    }
}
