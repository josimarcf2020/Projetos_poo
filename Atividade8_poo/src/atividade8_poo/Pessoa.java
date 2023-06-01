
package atividade8_poo;

public abstract class Pessoa {
    
    String nome;
    Data nascimento;

    public Pessoa() {
    }

    public Pessoa(String nome, Data nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }
    
    public abstract String imprimeDados();
    
}
