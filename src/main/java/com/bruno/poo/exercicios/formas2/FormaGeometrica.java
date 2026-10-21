/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.poo.exercicios.formas2;

/**
 *
 * @author bruno
 */
public abstract class FormaGeometrica {
    public abstract double getArea();
    public abstract double getPerimetro();
  
    public double getArea(String unidade) {
        System.out.println("A area da forma eh de :"+this.getArea()+" "+unidade);    
        return this.getArea();
    }
    
    public double getPerimetro(String unidade) {
        System.out.println("O perimetro da forma eh de: "+this.getPerimetro()+" "+unidade); 
        return this.getArea();
    }
}
