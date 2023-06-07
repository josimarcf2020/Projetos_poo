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
public class Receituario {
    
    private int codigo;
    private Atendimento atendimento;
    private Date data;
    private String medicacao;
    private String posologia;

    public Receituario() {
    }

    public Receituario(int codigo, Atendimento atendimento, Date data, String medicacao, String posologia) {
        this.codigo = codigo;
        this.atendimento = atendimento;
        this.data = data;
        this.medicacao = medicacao;
        this.posologia = posologia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getMedicacao() {
        return medicacao;
    }

    public void setMedicacao(String medicacao) {
        this.medicacao = medicacao;
    }

    public String getPosologia() {
        return posologia;
    }

    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }
    
    
    
}
