/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhotestes;

/**
 *
 * @author Aluno
 */
public class PessoaRetorno{
    public Pessoa pessoa;
    public float valorImc;
    public String categoriaImc;
    public String classificacaoEtaria;
    
    public PessoaRetorno(Pessoa pessoa, float valorImc, String categoriaImc, String classificacaoEtaria){
       this.pessoa = pessoa;
       this.valorImc = valorImc;
       this.categoriaImc = categoriaImc;
       this.classificacaoEtaria = classificacaoEtaria;
    }

    @Override
    public String toString() {
        return pessoa.toString() + " => "+ classificacaoEtaria+ ", IMC=" + valorImc + " - " + categoriaImc;
    }
    
}
