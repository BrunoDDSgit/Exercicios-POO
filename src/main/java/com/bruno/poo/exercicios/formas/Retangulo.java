package com.bruno.poo.exercicios.formas;

public class Retangulo extends Forma {

    private final double base;
    private final double altura;

    public Retangulo(double base, double altura) {
        this("Retângulo", base, altura);
    }

    public Retangulo(String nome, double base, double altura) {
        super(nome);
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Base e altura devem ser maiores que zero.");
        }
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;                  
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);            
    }
}
