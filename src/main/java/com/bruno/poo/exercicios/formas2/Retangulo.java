/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.poo.exercicios.formas2;

/**
 *
 * @author bruno
 */
public class Retangulo extends FormaGeometrica {
    private float base, altura;

    public Retangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double getArea() {return this.base*this.altura;}

    @Override
    public double getPerimetro() {return 2*(this.base+this.altura);}
    
    public boolean isQuadrado() {
        if (this.base == this.altura){
            System.out.println("Eh um quadrado");
            return true;
        } else {
            System.out.println("Nao eh um quadrado");
            return false;
        }
    }
    
    public float getBase() {return base;}
    public float getAltura() {return altura;}
    
    @Override
    public String toString() {
        return "Retangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
}
