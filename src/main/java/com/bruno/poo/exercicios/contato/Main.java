/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.poo.exercicios.contato;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nome, telefone;
        int n,  quantidade;
        
        System.out.println("Quantos contatos voce quer adicionar?\n");
        n = scan.nextInt();
        scan.nextLine();
        Contato[] contatos = new Contato[n];
        
        for (int i = 0; i < contatos.length; i++) {
            contatos[i] = new Contato(); // reservando espaço pra nao dar null
            
            System.out.println("Digite o nome do ["+(i+1)+"] contato.");
            nome = scan.nextLine();
            contatos[i].setNome(nome);
            System.out.println("Digite o telefone do ["+(i+1)+"] contato.");
            telefone = scan.nextLine();
            quantidade = telefone.length();
            do {
                if (quantidade == 11) {
                    contatos[i].setTelefone(telefone);         
                } else {
                    System.out.println("Erro: telefone invalido, digite 11 digitos (ex: DDD+9+numero de telefone)");
                    System.out.println("Digite novamente o telefone do ["+(i+1)+"] contato.");
                    telefone = scan.nextLine();
                    quantidade = telefone.length();
                }
            }while(contatos[i].getTelefone() == null);
        }
        
        for (int i = 0; i < contatos.length; i++) {
            System.out.println(contatos[i]);
        }
        
    }
    
}
