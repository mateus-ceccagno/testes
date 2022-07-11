/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.trabalhotestes;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class NewMain {
    public static void main(String[] args) {
        
        // CÓDIGO SEM FACADE 
        /*
        IMC imc = new IMC();
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>() {
            {
                add(new Pessoa("Mary", 40.3f, 1.70f, 22));
                add(new Pessoa("John", 95.1f, 1.70f, 89));
                add(new Pessoa("Peter", 95.1f, 1.90f, 36));
                add(new Pessoa("Elizabeth", 105.1f, 1.70f, 36));
            }
        };
        
        for (Pessoa pessoa : pessoas) {
            float imcCalculado = imc.obterIMC(pessoa);
            String classifcacaoIMC = imc.obterClassificacao(pessoa);
            String classifcacaoEtaria = imc.obterClassifcacaoEtaria(pessoa.idade);
            System.out.print(pessoa.toString() + obterClassifcacaoEtaria);
            System.out.print(" => ");
            System.out.println("IMC: " + imcCalculado + ", " + classifcacaoIMC);
        }
        */
        
        // CÓDIGO COM FACADE 
        FacadeIMC fachada = new FacadeIMC();        
        ArrayList<PessoaRetorno>resultado = new ArrayList<PessoaRetorno>() {
            {
                add(fachada.gerarPessoaParaIMC("Mary", 40.3f, 1.70f, 22));
                add(fachada.gerarPessoaParaIMC("John", 95.1f, 1.70f, 89));
                add(fachada.gerarPessoaParaIMC("Peter", 95.1f, 1.90f, 36));
                add(fachada.gerarPessoaParaIMC("Elizabeth", 105.1f, 1.70f, 36));
            }
        };
    }
}
