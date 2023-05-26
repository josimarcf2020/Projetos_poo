
package bancosenai;

import java.util.ArrayList;

public class GerenteRepository {
    
    public ArrayList<Gerente> gerente = new ArrayList<>();
    
    public ArrayList<Gerente> addGerente(){
        gerente.add(new Gerente("davis", "321654", "Davi", "Saldanha", "654321458"));
        gerente.add(new Gerente("teste", "teste", "Teste", "", ""));
        
        return gerente;
    }
    
}
