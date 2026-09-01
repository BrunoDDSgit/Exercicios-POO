/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.poo.exercicios.futebol;

/**
 *
 * @author bruno
 */
public class Main {
    public static void main(String[] args) {
        TimeDeFutebol time = new TimeDeFutebol("Time Aleatorio");

        Jogador j1 = new Jogador("Neymar", "1199999999", "Ativo", "Atacante");
        Jogador j2 = new Jogador("Casemiro", "1188888888", "Reserva", "Volante");

        Premiacao p1 = new Premiacao("Copa do Brasil", "Nacional", 2024);

        time.adicionarJogador(j1);
        time.adicionarJogador(j2);
        time.adicionarPremiacao(p1);

        time.listarJogadores();
        time.listarPremiacoes();
    }
}