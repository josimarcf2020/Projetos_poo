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
public class Financeiro {
    
    private int codigo;
    private Atendimentos atendimento;
    private Sessoes sessao;
    private Tratamentos tratamento;
    private Double valorNominal;
    private Date dataPagamento;
    private String modoPagamento;

    public Financeiro() {
    }

    public Financeiro(int codigo, Atendimentos atendimento, Sessoes sessao, Tratamentos tratamento, Double valorNominal, Date dataPagamento, String modoPagamento) {
        this.codigo = codigo;
        this.atendimento = atendimento;
        this.sessao = sessao;
        this.tratamento = tratamento;
        this.valorNominal = valorNominal;
        this.dataPagamento = dataPagamento;
        this.modoPagamento = modoPagamento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Atendimentos getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Atendimentos atendimento) {
        this.atendimento = atendimento;
    }

    public Sessoes getSessao() {
        return sessao;
    }

    public void setSessao(Sessoes sessao) {
        this.sessao = sessao;
    }

    public Tratamentos getTratamento() {
        return tratamento;
    }

    public void setTratamento(Tratamentos tratamento) {
        this.tratamento = tratamento;
    }

    public Double getValorNominal() {
        return valorNominal;
    }

    public void setValorNominal(Double valorNominal) {
        this.valorNominal = valorNominal;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getModoPagamento() {
        return modoPagamento;
    }

    public void setModoPagamento(String modoPagamento) {
        this.modoPagamento = modoPagamento;
    }
    
    
}
