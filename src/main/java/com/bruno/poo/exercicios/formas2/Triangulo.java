/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.poo.exercicios.formas2;

/**
 *
 * @author bruno
 */
public class Triangulo extends FormaGeometrica {
    private float ladoA, ladoB, ladoC;

    public Triangulo(float ladoA, float ladoB, float ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    
    public enum Tipo {
        Equilatero, Isosceles, Escaleno;
    }
    
    @Override
    public double getArea() {
        double p = getPerimetro() / 2.0;
        return Math.sqrt(p * (p - this.ladoA) * (p - this.ladoB) * (p - this.ladoC));
    }
    
    @Override
    public double getPerimetro() { return this.ladoA+this.ladoB+this.ladoC;}
    
    public float getLadoA() {return this.ladoA;}
    public float getLadoB() {return this.ladoB;}
    public float getLadoC() {return this.ladoC;}
    
    public Tipo getTipoTriangulo() {
        if (this.ladoA == this.ladoB && 
                this.ladoB == this.ladoC) return Tipo.Equilatero;
        else if(this.ladoA != this.ladoB 
                && this.ladoB != this.ladoC && 
                this.ladoC != this.ladoA) return Tipo.Escaleno;
        else return Tipo.Isosceles;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "lado A = " + ladoA + ", lado B = " + ladoB + ", lado C = " + ladoC + '}';
    }

    
    
    
    
}
