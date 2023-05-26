/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancosenai;

import java.util.Date;

public class Usuario {
   
    private String nome;
    private String sobrenome;
    private String telefone;
    
    
    Usuario(){
        
    }
    
    Usuario(String nm, String snome, String tel){
        this.nome = nm;
        this.sobrenome = snome;
        this.telefone = tel;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getSobrenome(){
        return this.sobrenome;
    }
    
     public void setSobrenome(String sobrenome){
        this.nome = sobrenome;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    String imprimirInfo(){
        return String.format("Nome: %s\nSobrenome: %s\nTelefone: %s Data de Registro: %d", nome, sobrenome, telefone, dataRegistro);
    }
}
