/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhotestes;

/**
 *
 * @author Aluno
 */

public class FacadeIMC {
    private IMC imc = new IMC();
    
    public FacadeIMC() { }

    public PessoaRetorno gerarPessoaParaIMC(String nome, float peso, float altura, int idade) {
        Pessoa pessoa = new Pessoa(nome, peso, altura, idade);
        Float valorImc = imc.obterIMC(pessoa);
        String categoriaImc = imc.obterClassificacao(valorImc);
        String classificacaoEtaria = imc.obterClassificacaoEtaria(idade);
        
        PessoaRetorno pessoaRetorno = new PessoaRetorno(pessoa, valorImc, categoriaImc, classificacaoEtaria);
        System.out.println(pessoaRetorno.toString());
        return pessoaRetorno;
   }
}
