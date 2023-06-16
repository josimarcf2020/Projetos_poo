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
public class Pedido {
    
    private String numPedido;
    private Date dataCriacao;

    public Pedido() {
    }

    public Pedido(String numPedido, Date dataCriacao) {
        this.numPedido = numPedido;
        this.dataCriacao = dataCriacao;
    }

    public String getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(String numPedido) {
        this.numPedido = numPedido;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    
    public String imprimirInfo(){
        return "";
    }
    
    public double calcaularPreco(){
        return 0.0;
    }
    
}
