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
    
    private int numPedido;
    private Date dataCriacao;
    private String produto;
    private double valor;
    private int status;

    public Pedido() {
    }

    public Pedido(int numPedido, Date dataCriacao, String produto, double valor, int status) {
        this.numPedido = numPedido;
        this.dataCriacao = dataCriacao;
        this.produto = produto;
        this.valor = valor;
        this.status = status;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String imprimirInfo(){
        return "";
    }
    
    public double calcaularPreco(){
        return 0.0;
    }
    
}
