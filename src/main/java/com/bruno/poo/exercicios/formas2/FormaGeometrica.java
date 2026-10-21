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
  
    public String getArea(String unidade) {
        return "A area da forma eh de :"+this.getArea()+" "+unidade;
    }
    public String getPerimetro(String unidade) {
        return "O perimetro da forma eh de: "+this.getPerimetro()+" "+unidade;
    }
}
