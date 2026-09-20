package com.bruno.poo.exercicios.formas;
import java.util.Locale;

public abstract class Forma implements Desenhavel {

    private final String nome;

    protected Forma(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    @Override
    public void exibirInformacoes() {
        System.out.println("Tipo: " + nome);
        System.out.println("Area: "+ calcularArea());
        System.out.println("Perimetro: "+ calcularPerimetro());
        System.out.println("------------------------------");
    }
}
