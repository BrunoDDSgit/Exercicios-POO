/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.poo.exercicios.futebol;

/**
 *
 * @author bruno
 */
public class TimeDeFutebol {
    private String nomeTime;
    private Jogador[] jogadores;
    private Premiacao[] premiacoes;
    private int totalJogadores;
    private int totalPremiacoes;

    public TimeDeFutebol(String nomeTime) {
        this.nomeTime = nomeTime;
        this.jogadores = new Jogador[23]; // Capacidade máxima de 23 jogadores
        this.premiacoes = new Premiacao[50]; // Capacidade padrão de até 50 títulos
        this.totalJogadores = 0;
        this.totalPremiacoes = 0;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public int contarAtivos() {
        int ativos = 0;
        for (int i = 0; i < totalJogadores; i++) {
            if (jogadores[i].getSituacao().equalsIgnoreCase("ativo")) {
                ativos++;
            }
        }
        return ativos;
    }

    public int contarReservas() {
        int reservas = 0;
        for (int i = 0; i < totalJogadores; i++) {
            if (jogadores[i].getSituacao().equalsIgnoreCase("reserva")) {
                reservas++;
            }
        }
        return reservas;
    }

    public void adicionarJogador(Jogador jogador) {
        if (totalJogadores >= jogadores.length) {
            System.out.println("Erro: Elenco cheio (máximo 23 jogadores).");
            return;
        }

        if (jogador.getSituacao().equalsIgnoreCase("ativo") && contarAtivos() >= 11) {
            System.out.println("Não foi possível adicionar " + jogador.getNome() + " | Limite de titulares (11) atingido.");
            return;
        }

        if (jogador.getSituacao().equalsIgnoreCase("reserva") && contarReservas() >= 12) {
            System.out.println("Não foi possível adicionar " + jogador.getNome() + " | Limite de reservas (12) atingido.");
            return;
        }

        jogadores[totalJogadores] = jogador;
        totalJogadores++;
        System.out.println("Jogador " + jogador.getNome() + " adicionado com sucesso!");
    }

    public void adicionarPremiacao(Premiacao premiacao) {
        if (totalPremiacoes < premiacoes.length) {
            premiacoes[totalPremiacoes] = premiacao;
            totalPremiacoes++;
        } else {
            System.out.println("Limite de premiações atingido.");
        }
    }

    public void listarJogadores() {
        System.out.println("\n--- ELENCO DO " + nomeTime.toUpperCase() + " ---");
        if (totalJogadores == 0) {
            System.out.println("Nenhum jogador cadastrado.");
            return;
        }
        for (int i = 0; i < totalJogadores; i++) {
            System.out.println(jogadores[i]);
        }
    }

    public void listarPremiacoes() {
        System.out.println("\n--- TÍTULOS DO " + nomeTime.toUpperCase() + " ---");
        if (totalPremiacoes == 0) {
            System.out.println("Nenhum título cadastrado.");
            return;
        }
        for (int i = 0; i < totalPremiacoes; i++) {
            System.out.println(premiacoes[i]);
        }
    }
}