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
public class Atendimentos {
    
    private int id;
    private Cliente cliente;
    private Date dataAtendimento;
    private String queixa;
    private String status;

    public Atendimentos() {
    }

    public Atendimentos(int id, Cliente cliente, Date dataAtendimento, String queixa, String status) {
        this.id = id;
        this.cliente = cliente;
        this.dataAtendimento = dataAtendimento;
        this.queixa = queixa;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(Date dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public String getQueixa() {
        return queixa;
    }

    public void setQueixa(String queixa) {
        this.queixa = queixa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
