package com.bruno.poo.exercicios.animais;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Caramelo", "05/02/2016", 3.5, "Casa", true, "Marrom");
        Arara arara = new Arara("Blue", "01/09/2026", 1.2, "Floresta", true, "azul","grande", true);
        Calopsita calopsita = new Calopsita("Linda", "08/07/2025", 1.0, "Floresta", true, "branca", "pequeno", true);
        Galinha galinha = new Galinha("Penelope", "12/03/2024", 4.3, "Galinheiro", true ,"marrom", "medio", false);
        Gato gato = new Gato("Jose", "02/04/2011", 5.5, "Casa", true, "preto");
        Iguana iguana = new Iguana("Leo", "03/09/2024", 9.3, "Lago", false, "Escama", false);
        Pardal pardal = new Pardal("Filo", "16/03/2020", 1.7, "Floresta", false, "creme", "pequeno", true);
        Tartaruga tartaruga = new Tartaruga("ninja", "02/02/2022", 12.8, "Lago", false, "escama", true);

        System.out.println(cachorro);
        System.out.println(arara);
        System.out.println(calopsita);
        System.out.println(galinha);
        System.out.println(gato);
        System.out.println(iguana);
        System.out.println(pardal);
        System.out.println(tartaruga);
    }
}
