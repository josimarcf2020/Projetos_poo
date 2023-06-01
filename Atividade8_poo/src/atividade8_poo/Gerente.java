
package atividade8_poo;

public class Gerente extends Funcionario {
    
    private String area;

    public Gerente() {
    }

    public Gerente(String area) {
        this.area = area;
    }

    public Gerente(String area, float salario) {
        super(salario);
        this.area = area;
    }

    public Gerente(String area, float salario, String nome, Data nascimento) {
        super(salario, nome, nascimento);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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
    
    @Override
    public Double calculaImposto(){
        return this.salario * 0.05;
    }
    
    @Override
    public String imprimeDados(){
        return "";
    }
    
}
