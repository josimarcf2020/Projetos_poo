
package atividade8_poo;

public class CadastroPessoas extends Pessoa {
    
    private int qtdAtual;

    public CadastroPessoas() {
    }

    public CadastroPessoas(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public CadastroPessoas(int qtdAtual, String nome, Data nascimento) {
        super(nome, nascimento);
        this.qtdAtual = qtdAtual;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
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
    
    public void cadastraPessoa(Pessoa pess){
        
    }
    
    public void imprimeCadastro(){
        
    }
    
    public String imprimeDados(){
        return "";
    }
}
