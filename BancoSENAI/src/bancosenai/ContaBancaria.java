
package bancosenai;

public class ContaBancaria {
    //atributos
    private String agencia;
    private String conta;
    private double saldo;
    private Usuario titular;
    
    //metodos
    ContaBancaria(){
        
    }
    
    ContaBancaria(String ag, String cnt, double sld, Usuario tit){
        this.agencia = ag;
        this.conta = cnt;
        this.saldo = sld;
        this.titular = tit;
    }
    
    String getAgencia(){
        return this.agencia;
    }

    void setAgencia(String agencia){
        this.agencia = agencia;
    }

    String getConta(){
        return this.conta;
    }

    void setConta(String conta){
        this.conta = conta;
    }
    
    double getSaldo(){
        return this.saldo;
    }
    
    void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    Usuario getTitular(){
        return this.titular;
    }

    void setTitular(Usuario titular){
        this.titular = titular;
    }
    
    void depositar(double valor){
        this.saldo += valor;        
    }
    
    boolean sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            System.out.println("Saldo insuficiente!!");
            return false;
        }
    }
    
    void transferir(double valor, ContaBancaria conta2){
        if (this.sacar(valor)){
            conta2.depositar(valor);
        }
    }
    
    String consultarSaldo(){
        // String.format() método da classe string paea utlizar formatação
        // com identificadores(%d, %f, %s).
        return String.format("Saldo atual: R$ %.2f", this.saldo);
    }
    
}
