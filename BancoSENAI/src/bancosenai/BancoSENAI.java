package bancosenai;

import java.util.Scanner;

/**
 *
 * @author josimar
 */
public class BancoSENAI {

    public static void main(String[] args) {
       
        // Instanciando objetos do tipo ContaBancaria
        var conta1 = new ContaBancaria();
        Usuario cliente = new Usuario();
        var conta2 = new ContaBancaria();       
        Usuario cliente2 = new Usuario();
        String nome="", sobrenome="", agencia="", telefone="", conta="", titular="";
        double saldo;
        
        Usuario[] clientes = new Usuario[10];   
        ContaBancaria[] contaBancaria = new ContaBancaria[10];
        
        int i = 0;
        String opc = "";
        
        Scanner in = new Scanner(System.in);
        
        do {
            
            System.out.println("BEM VINDO AO BANCO SENAI\n");
            System.out.println("\n1. CADASTRO DE CLIENTES\n");
            System.out.println("\n2. CADASTRO DE CONTAS\n");
            System.out.println("\n0. FINALIZAR OPERAÇÕES\n");
            System.out.print("\n Digite a operação: ");
            opc = in.next();
            
            if(opc.equals("0")){
                System.out.println("Encerrando... BYE!");
                break;
            }
            
            switch (opc){
                case "1":
                    do {
                        in.nextLine();
                        System.out.println("\nBANCO SENAI\n");
                        System.out.println("===============\n");
                        System.out.print("\n*** Cadastro de clientes ***\n");
                        System.out.print("\nNome ou FIM para encerrrar: ");
                        nome = in.nextLine();
                        
                        if(nome.toUpperCase().equals("FIM")){
                            System.out.println("Encerrando a inserção de clientes");
                            break;
                        }
                        
                        System.out.print("\nSobrenome.................: ");
                        sobrenome = in.next();
                        
                        System.out.print("\nTelefone..................: ");
                        telefone = in.next();
                        
                        clientes[i].setNome(nome);
                        clientes[i].setSobrenome(sobrenome);
                        clientes[i].setTelefone(telefone);              
                        
                        i += 1;
                        
                        if(clientes.length <= i){
                            System.out.println("Limite do Cadastro alcançado...");
                            break;
                        }
                        
                    }while (true);
                    
                    break;
                case "2":
                    do {
                        System.out.println("\nBANCO SENAI\n");
                        System.out.println("===============\n");
                        System.out.print("\n*** Cadastro de contas ***\n");
                        System.out.print("\nNumero da agencia ou FIM para encerrrar: ");
                        agencia = in.next();
                        
                        if(agencia.toUpperCase().equals("FIM")){
                            System.out.println("Encerrando a inserção de contas");
                            break;
                        }
                        
                        System.out.print("\nConta Bancaria..........................: ");
                        conta = in.next();
                        
                        System.out.print("\nTitular.................................: ");
                        titular = in.next();
                        
                        System.out.print("\nSaldo...................................: ");
                        saldo = in.nextDouble();
                        
                        contaBancaria[i].setAgencia(agencia);
                        contaBancaria[i].setConta(conta);
                        contaBancaria[i].setTitular(cliente2);
                        contaBancaria[i].setSaldo(saldo);
                        
                        i += 1;
                        
                        if(contaBancaria.length <= i){
                            System.out.println("Limite do Cadastro alcançado...");
                            break;
                        }
                        
                    }while (true);
                    
                    break;
                default:
                    System.out.println("Opção inválida!!!\n\n");
                    continue;
            }         

        }while (true);
        
    }
    
}
