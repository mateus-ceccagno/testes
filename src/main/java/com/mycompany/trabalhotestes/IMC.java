/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhotestes;

/**
 *
 * @author Aluno
 */
public class IMC {
    static String abaixoDoPeso = "Abaixo do Peso";
    static String pesoIdeal = "Peso Ideal";
    static String levementeAcimaPeso = "Levemente acima do Peso";
    static String obesidadeLeve = "Obesidade Leve";
    static String obesidadeSereva = "Obesidade Severa";
    static String obesidadeMorbida = "Obesidade Mórbida";

    static String infancia = "Infância";
    static String adolescencia = "Adolescência";
    static String adulto = "Fase Adulta";
    static String velhice = "Velhice";
    
    public IMC() { 
    }
    
    public String obterClassificacao(Float imcCalculado){
        String classificacao = "";

        if (imcCalculado <= 18.5f)
            classificacao = abaixoDoPeso;
        else if (imcCalculado > 18.5f && imcCalculado < 25.0f)
            classificacao = pesoIdeal;
        else if (imcCalculado >= 25.0f && imcCalculado < 30.0f)
            classificacao = levementeAcimaPeso;
        else if (imcCalculado >= 30.0f && imcCalculado < 35.0f )
            classificacao = obesidadeLeve;
        else if (imcCalculado >= 35.0f && imcCalculado < 40.0f )
            classificacao = obesidadeSereva;
        else if (imcCalculado >= 40.0f)
            classificacao = obesidadeMorbida;
        
        return classificacao;
    }
    
    public float obterIMC(Pessoa pessoa){
        float imcCalculado = pessoa.peso / (pessoa.altura * pessoa.altura);
        return imcCalculado;
    }
    
    public String obterClassificacaoEtaria(int idade){
        String classificacao = "";

        if (idade <= 11)
            classificacao = infancia;
        else if (idade > 11 && idade < 21)
            classificacao = adolescencia;
        else if (idade >= 21 && idade < 75)
            classificacao = adulto;
        else if (idade >= 75)
            classificacao = velhice;
        
        return classificacao;
    }
}
