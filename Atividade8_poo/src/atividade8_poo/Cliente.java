
package atividade8_poo;

public class Cliente extends Pessoa {
    
    private int codigo;

    public Cliente() {
    }

    public Cliente(int codigo) {
        this.codigo = codigo;
    }

    public Cliente(int codigo, String nome, Data nascimento) {
        super(nome, nascimento);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
    public  String imprimeDados(){
        return "";
    }
    
}
