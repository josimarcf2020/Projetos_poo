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
public class Admin extends Usuario {
    
    private String nomeAdmin;

    public Admin() {
    }

    public Admin(String login, String senha, Date dataRegistro, String email) {
        super(login, senha, dataRegistro, email);
    }

    public Admin(String nomeAdmin) {
        this.nomeAdmin = nomeAdmin;
    }

    public Admin(String nomeAdmin, String login, String senha, Date dataRegistro, String email) {
        super(login, senha, dataRegistro, email);
        this.nomeAdmin = nomeAdmin;
    }

    public String getNomeAdmin() {
        return nomeAdmin;
    }

    public void setNomeAdmin(String nomeAdmin) {
        this.nomeAdmin = nomeAdmin;
    }
    
    public void atualizarProduto(){
        
    }
    
}
