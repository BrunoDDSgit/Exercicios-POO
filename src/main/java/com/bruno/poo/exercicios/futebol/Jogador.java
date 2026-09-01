/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.poo.exercicios.futebol;

/**
 *
 * @author bruno
 */
public class Jogador {
    private final String nome;
    private String telefone;
    private String situacao; // Reserva ou Ativo
    private String posicao;

    public Jogador(String nome, String telefone, String situacao, String posicao) {
        this.nome = nome;
        this.telefone = telefone;
        this.situacao = situacao;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getSituacao() {
        return situacao;
    }
    
    public String getPosicao() {
        return posicao;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    
    @Override
    public String toString() {
        return "Nome: "+this.nome+
                "\nTelefone: "+this.telefone+
                "\nSituacao:"+this.situacao+
                "\nPosicao:"+this.posicao;
    }
    
    
}
