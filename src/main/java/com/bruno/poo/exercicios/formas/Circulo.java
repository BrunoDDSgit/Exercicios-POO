package com.bruno.poo.exercicios.formas;

public class Circulo extends Forma {

    private final double raio;

    public Circulo(double raio) {
        super("Círculo");
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio deve ser maior que zero.");
        }
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;          // π · r²
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;             // 2 · π · r
    }
}
