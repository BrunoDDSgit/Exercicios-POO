/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.poo.exercicios.animais;

/**
 *
 * @author bruno
 */
public class Animal {
    private String nome;
    private final String data_nascimento;
    private double peso;
    private String moradia;
    private boolean domestico;

    public Animal(String nome, String data_nascimento, double peso, String habitat, boolean domestico) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.peso = peso;
        this.moradia = habitat;
        this.domestico = domestico;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getHabitat() {
        return moradia;
    }

    public void setHabitat(String habitat) {
        this.moradia = habitat;
    }

    public boolean isDomestico() {
        return domestico;
    }

    public void setDomestico(boolean domestico) {
        this.domestico = domestico;
    }

    @Override
    public String toString() {
        return "Nome=" + nome + 
                "\nData_nascimento:" + data_nascimento + 
                "\nPeso:" + peso + 
                "\nMoradia:" + moradia + 
                "\nDomestico:" + domestico;
    }
    
        
}
