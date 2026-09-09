/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.poo.exercicios.animais;

/**
 *
 * @author bruno
 */
public class Calopsita extends Ave {
    public Calopsita(String nome, String data_nascimento, double peso, String habitat, boolean domestico, String cor_penas, String tipo_bico, boolean voa) {
        super(nome, data_nascimento, peso, habitat, domestico, cor_penas, tipo_bico, voa);
    }
    
    
    @Override
    public String toString() {
      return "\n========== Calopsita =============\n"
              +super.toString()+
              "\n================================\n";
    }
}
