/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sap_pratica;

import java.util.Date;

/**
 *
 * @author josim
 */
public class Cliente extends Usuario {
    
    private String nomeCliente;
    private String endereco;

    public Cliente() {
    }

    public Cliente(String nomeCliente, String endereco) {
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
    }

    public Cliente(String nomeCliente, String endereco, String login, String senha, Date dataRegistro, String email) {
        super(login, senha, dataRegistro, email);
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void atualizarPerfil(){
        
    }
    
    public String imprimirInfo(){
        return "";
    }
    
    public String visulaizarPedidos(){
        return "";
    }
}
