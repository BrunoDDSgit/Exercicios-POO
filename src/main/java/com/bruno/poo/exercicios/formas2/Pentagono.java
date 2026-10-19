/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.poo.exercicios.formas2;

/**
 *
 * @author bruno
 */
public class Pentagono extends FormaGeometrica {
    private float lado;
    private double apotema;

    public Pentagono(float lado) {
        this.lado = lado;
        this.apotema = lado*Math.tan(Math.PI*0.2);
    }
    
    @Override
    public double getArea() {return this.getPerimetro()*apotema;}

    @Override
    public double getPerimetro() {return 5*this.lado;}

    public float getLado() {return lado;}
    public double getApotema() {return apotema;}
    
    public int getNumeroLados() {
        return 5;
    }

    @Override
    public String toString() {
        return "Pentagono{" + "lado=" + lado + ", apotema=" + apotema + '}';
    }
            
    
}
