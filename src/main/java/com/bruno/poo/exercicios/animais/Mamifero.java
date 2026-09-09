/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.poo.exercicios.animais;

/**
 *
 * @author bruno
 */
public class Mamifero extends Animal {
    private String cor_pelos;

    public Mamifero(String nome, String data_nascimento, double peso, String habitat, boolean domestico, String cor_pelos) {
        super(nome, data_nascimento, peso, habitat, domestico);
        this.cor_pelos = cor_pelos;
    }

    public String getCor_pelos() {
        return cor_pelos;
    }

    public void setCor_pelos(String cor_pelos) {
        this.cor_pelos = cor_pelos;
    }
}
