/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appfisio;

import java.util.Date;

/**
 *
 * @author Josimar Ferreira
 */
public class Cliente {
    
    private String codigo;
    private String nome;
    private String telefone;
    private Date dataNasc;
    private String sexoo;
    private String anamnese;
    private String endereco;
    private String status;

    public Cliente() {
    }

    public Cliente(String codigo, String nome, String telefone, Date dataNasc, String sexoo, String anamnese, String endereco, String status) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.sexoo = sexoo;
        this.anamnese = anamnese;
        this.endereco = endereco;
        this.status = status;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexoo() {
        return sexoo;
    }

    public void setSexoo(String sexoo) {
        this.sexoo = sexoo;
    }

    public String getAnamnese() {
        return anamnese;
    }

    public void setAnamnese(String anamnese) {
        this.anamnese = anamnese;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void cadastrar(){
        
    }
    
    public void consultar(){
        
    }
    
    public void atualizar(){
        
    }
    
    public void deletar(){
        
    }
    
}
