
package bancosenai;

import java.util.Date;

public class Cliente extends Usuario {
    
    private Date dataRegistro = new Date();

    public Cliente() {
    }

    public Cliente(String nm, String snome, String tel) {
        super(nm, snome, tel);
    }
    
    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
    
    @Override
    String imprimirInfo(){
        return String.format("Nome: %s\nSobrenome: %s\nTelefone: %s Data de Registro: %d",
                super.getNome(), super.getSobrenome(), super.getTelefone(), this.getDataRegistro());
    }
    
}
