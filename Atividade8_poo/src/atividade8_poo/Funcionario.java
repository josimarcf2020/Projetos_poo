
package atividade8_poo;


public class Funcionario extends Pessoa {
    
    float salario;

    public Funcionario() {
    }

    public Funcionario(float salario) {
        this.salario = salario;
    }

    public Funcionario(float salario, String nome, Data nascimento) {
        super(nome, nascimento);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
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
    
    public Double calculaImposto(){
        return (this.salario * 0.03);
    }
    
    @Override
    public String imprimeDados(){
        return "";
    }
}
