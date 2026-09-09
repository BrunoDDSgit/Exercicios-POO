/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.poo.exercicios.animais;

/**
 *
 * @author bruno
 */
public class Tartaruga extends Reptil {
    public Tartaruga(String nome, String data_nascimento, double peso, String habitat, boolean domestico, String tipoPele, boolean aquatico) {
        super(nome, data_nascimento, peso, habitat, domestico, tipoPele, aquatico);
    }
    
    @Override
    public String toString() {
      return "\n========== Tartaruga =============\n"
              +super.toString()+
              "\n================================\n";
    }
}
