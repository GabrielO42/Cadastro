/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.df.cadastro1;

/**
 *
 * @author gabriel62947886
 */
public class Cliente {

    private String Codigo;
    private String Nome;
    private String Contato;
    private boolean ativo;
    private String CPF;
    private String identidade;
    private String datanasc;
    private String CNPJ;
    private String inscricao;
    private String endereco;
    private String numero;
    private String complemento;
    private String CEP;
    private String bairro;
    private String cidade;
    private String masculino;
    private String feminino;
    private String fone;
    private String fax;
    private String celular;
    private String email;
    private String atividade;
    private String observacao;

    public Cliente(
        String Codigo, String Nome, String Contato,
        boolean ativo, String CPF, String identidade,
        String datanasc, String CNPJ, String inscricao,
        String endereco, String numero, String complemento,
        String CEP, String bairro, String cidade,
        String masculino, String feminino, String fone, String fax, String celular,
        String email, String atividade, String observacao
    ) {
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.Contato = Contato;
        this.ativo = ativo;
        this.CPF = CPF;
        this.identidade = identidade;
        this.datanasc = datanasc;
        this.CNPJ = CNPJ;
        this.inscricao = inscricao;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.CEP = CEP;
        this.bairro = bairro;
        this.cidade = cidade;
        this.masculino = masculino;
        this.feminino = feminino;
        this.fone = fone;
        this.fax = fax;
        this.celular = celular;
        this.email = email;
        this.atividade = atividade;
        this.observacao = observacao;
    }
}
    

