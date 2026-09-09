/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.poo.exercicios.animais;

/**
 *
 * @author bruno
 */
public class Gato extends Mamifero {
    public Gato(String nome, String data_nascimento, double peso, String habitat, boolean domestico, String cor_pelos) {
        super(nome, data_nascimento, peso, habitat, domestico, cor_pelos);
    }
    
    @Override
    public String toString() {
      return "\n========== Gato =============\n"
              +super.toString()+
              "\n================================\n";
    }
}
