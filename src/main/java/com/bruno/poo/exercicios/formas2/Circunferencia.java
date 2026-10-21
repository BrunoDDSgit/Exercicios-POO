/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.poo.exercicios.formas2;

/**
 *
 * @author bruno
 */
public class Circunferencia extends FormaGeometrica {
    private float raio;

    public Circunferencia(float raio) {
        this.raio = raio;
    }
    
    @Override
    public double getArea() { return Math.PI*Math.pow(this.raio, 2);}

    @Override
    public double getPerimetro() {return 2*Math.PI*this.raio;}
    
    public double getDiametro() {
        return this.raio*2;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "raio=" + raio + '}';
    }

}
