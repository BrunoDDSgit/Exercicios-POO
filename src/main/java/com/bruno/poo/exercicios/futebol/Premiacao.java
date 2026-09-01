/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.poo.exercicios.futebol;

/**
 *
 * @author bruno
 */

public class Premiacao {
    private String nome;
    private String abrangencia;
    private int ano;
    
    public Premiacao(String nome, String abrangencia, int ano) {
        this.nome = nome;
        this.abrangencia = abrangencia;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getAbrangencia() {
        return abrangencia;
    }

    public void setAbrangencia(String abrangencia) {
        this.abrangencia = abrangencia;
    }


    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    @Override
    public String toString() {
        return "Nome: "+this.nome+
                "Abrangencia: "+this.abrangencia+
                "\nAno: "+this.ano;
    }
    
    
    
}
