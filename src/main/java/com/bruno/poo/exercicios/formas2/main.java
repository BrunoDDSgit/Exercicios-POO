/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.poo.exercicios.formas2;
import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class main {
    public static void main(String[] args) {
        ArrayList<FormaGeometrica> lista = new ArrayList<FormaGeometrica>();
        
        lista.add(new Circunferencia(5));
        lista.add(new Pentagono(14));
        lista.add(new Retangulo(5, 10));
        lista.add(new Retangulo(2, 2));
        lista.add(new Circunferencia(15));
        lista.add(new Triangulo(3,4,5));
        lista.add(new Triangulo(5, 10, 10));
        lista.add(new Triangulo(4,4,4));
        
        imprimirFiguras(lista);
        mostrarDiametros(lista);
    }
    
    public static void imprimirFiguras(ArrayList<FormaGeometrica> figuras) {
        System.out.println("\n----- IMPRIMINDO FIGURAS ------");
        for (FormaGeometrica f : figuras) {
            System.out.println("---------- Figura numero: "+figuras.indexOf(f)+ " ----------");
            System.out.println(f);
            System.out.println("Area: "+f.getArea());
            System.out.println("Perimetro: "+f.getPerimetro());
            
            if (f instanceof Triangulo) {
                Triangulo t = (Triangulo) f;
                System.out.println("Tipo: "+t.getTipoTriangulo());
            } else if(f instanceof Retangulo) {
                Retangulo r = (Retangulo) f;
                r.isQuadrado();
            } else if(f instanceof Circunferencia) {
                Circunferencia c = (Circunferencia) f;
                System.out.println("Diametro:" +c.getDiametro());
            } else if (f instanceof Pentagono) {
                Pentagono p = (Pentagono) f;
                System.out.println("Quantidade de lados do pentagono: "+p.getNumeroLados());
            } else System.out.println("Figuta nao catalogada.");
            System.out.println("");
        }
        System.out.println("----- FIM DA IMPRESSAO ------");
        
        System.out.println("\n---- IMPRIMINDO FIGURAS COM O METODOS SOBRECARREGADOS ----");
        for (FormaGeometrica f : figuras) {
            System.out.println("---------- Figura numero: "+figuras.indexOf(f)+ " ----------");
                System.out.println(f);
                System.out.println(f.getArea("Metros Quadrados"));
                System.out.println(f.getPerimetro("Metros"));

                if (f instanceof Triangulo) {
                    Triangulo t = (Triangulo) f;
                    System.out.println("Tipo: "+t.getTipoTriangulo());
                } else if(f instanceof Retangulo) {
                    Retangulo r = (Retangulo) f;
                    r.isQuadrado();
                } else if(f instanceof Circunferencia) {
                    Circunferencia c = (Circunferencia) f;
                    System.out.println("Diametro:" +c.getDiametro());
                } else if (f instanceof Pentagono) {
                    Pentagono p = (Pentagono) f;
                    System.out.println("Quantidade de lados do pentagono: "+p.getNumeroLados());
                } else System.out.println("Figuta nao catalogada.");
                System.out.println("");
        }
        System.out.println("----- FIM DA IMPRESSAO ------");
    }
    
    public static void mostrarDiametros(ArrayList<FormaGeometrica> figuras) {
        System.out.println("\n---- FUNCAO MOSTRAR DIAMETRO ----");
        for (FormaGeometrica f : figuras) {
            figuras.indexOf(f);
            if (f instanceof Circunferencia) {
                Circunferencia c = (Circunferencia) f;
                System.out.println("O elemento de index "+figuras.indexOf(f)+
                " Na lista eh uma circunferencia e possui um Diametro de: "+c.getDiametro());
            }
        }
        System.out.println("---- FIM DA FUNCAO MOSTRAR DIAMETRO ----");
    }
    
}
