/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhotestes;

/**
 *
 * @author Aluno
 */
public class Pessoa {
    public String nome;
    public float peso, altura;
    public int idade;

    public Pessoa(String nome, float peso, float altura, int idade) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome + ", " + peso + "kg, " + altura + "cm, " + idade + " anos";
    }
    
    
}
