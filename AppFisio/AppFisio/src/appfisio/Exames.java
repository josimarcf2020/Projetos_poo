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
public class Exames {
    
    private String id;
    private String exame;
    private Date dataRequisicao;
    private Date dataEntrega;
    private String laudo;
    private Atendimentos atendimento;

    public Exames() {
    }

    public Exames(String id, String exame, Date dataRequisicao, Date dataEntrega, String laudo, Atendimentos atendimento) {
        this.id = id;
        this.exame = exame;
        this.dataRequisicao = dataRequisicao;
        this.dataEntrega = dataEntrega;
        this.laudo = laudo;
        this.atendimento = atendimento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExame() {
        return exame;
    }

    public void setExame(String exame) {
        this.exame = exame;
    }

    public Date getDataRequisicao() {
        return dataRequisicao;
    }

    public void setDataRequisicao(Date dataRequisicao) {
        this.dataRequisicao = dataRequisicao;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getLaudo() {
        return laudo;
    }

    public void setLaudo(String laudo) {
        this.laudo = laudo;
    }

    public Atendimentos getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Atendimentos atendimento) {
        this.atendimento = atendimento;
    }
    
    
    
}
