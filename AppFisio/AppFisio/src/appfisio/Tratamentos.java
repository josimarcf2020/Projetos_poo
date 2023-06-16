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
public class Tratamentos {
    
    private int codigo;
    private Atendimentos atendimento;
    private String tratamento;
    private Date dataInicio;
    private Date dataFinal;
    private int duracao;

    public Tratamentos() {
    }

    public Tratamentos(int codigo, Atendimentos atendimento, String tratamento, Date dataInicio, Date dataFinal, int duracao) {
        this.codigo = codigo;
        this.atendimento = atendimento;
        this.tratamento = tratamento;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.duracao = duracao;
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

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    
}
