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
public class Sessoes {
    
    private int codigo;
    private Tratamentos tratamento;
    private Date dataHora;
    private String descricao;

    public Sessoes() {
    }

    public Sessoes(int codigo, Tratamentos tratamento, Date dataHora, String descricao) {
        this.codigo = codigo;
        this.tratamento = tratamento;
        this.dataHora = dataHora;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Tratamentos getTratamento() {
        return tratamento;
    }

    public void setTratamento(Tratamentos tratamento) {
        this.tratamento = tratamento;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
