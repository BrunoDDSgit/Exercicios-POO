/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.poo.exercicios.animais;

/**
 *
 * @author bruno
 */
public class Ave extends Animal {
    private String cor_penas;
    private String tipo_bico;
    private boolean voa; // true para voa e false para nao voa

    public Ave(String nome, String data_nascimento, double peso, String habitat, boolean domestico, String cor_penas, String tipo_bico, boolean voa) {
        super(nome, data_nascimento, peso, habitat, domestico);
        this.cor_penas = cor_penas;
        this.tipo_bico = tipo_bico;
        this.voa = voa;
    }

    public String getCor_penas() {
        return cor_penas;
    }

    public void setCor_penas(String cor_penas) {
        this.cor_penas = cor_penas;
    }

    public String getTipo_bico() {
        return tipo_bico;
    }

    public void setTipo_bico(String tipo_bico) {
        this.tipo_bico = tipo_bico;
    }

    public boolean isVoa() {
        return voa;
    }

    public void setVoa(boolean voa) {
        this.voa = voa;
    }
}
