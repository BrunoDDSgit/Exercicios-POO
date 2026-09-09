/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.poo.exercicios.animais;

/**
 *
 * @author bruno
 */
public class Reptil extends Animal {
    private String tipoPele; // escamas, carapaça ou placas
    private boolean aquatico;

    public Reptil(String nome, String data_nascimento, double peso, String habitat, boolean domestico, String tipoPele, boolean aquatico) {
        super(nome, data_nascimento, peso, habitat, domestico);
        this.tipoPele = tipoPele;
        this.aquatico = aquatico;
    }

    public String getTipoPele() {
        return tipoPele;
    }

    public void setTipoPele(String tipoPele) {
        this.tipoPele = tipoPele;
    }

    public boolean isAquatico() {
        return aquatico;
    }

    public void setAquatico(boolean aquatico) {
        this.aquatico = aquatico;
    }
}
