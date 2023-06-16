/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sap_pratica;

/**
 *
 * @author josim
 */
public class CartaoCredito {
    
    private String numero;
    private String titular;
    private String dtValidade;
    private String ccv;

    public CartaoCredito() {
    }

    public CartaoCredito(String numero, String titular, String dtValidade, String ccv) {
        this.numero = numero;
        this.titular = titular;
        this.dtValidade = dtValidade;
        this.ccv = ccv;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getDtValidade() {
        return dtValidade;
    }

    public void setDtValidade(String dtValidade) {
        this.dtValidade = dtValidade;
    }

    public String getCcv() {
        return ccv;
    }

    public void setCcv(String ccv) {
        this.ccv = ccv;
    }
    
    public String imprimirInfo(){
        return "";
    }
    
}
