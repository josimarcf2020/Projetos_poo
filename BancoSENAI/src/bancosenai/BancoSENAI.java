package bancosenai;

import java.util.ArrayList;
import java.util.Scanner;

public class BancoSENAI {

    public static void main(String[] args) {
        
        int  opc;
        boolean isLogin = false;
        
        Scanner in = new Scanner(System.in);
       
        ArrayList<Usuario> cliente = new ArrayList();
        ArrayList<ContaBancaria> conta = new ArrayList();
        ArrayList<Gerente> gerentes = new ArrayList();
        
        GerenteRepository db_gerente = new GerenteRepository();
        
        gerentes = db_gerente.addGerente();
        
        do{
            
            System.out.println("Seja Bem vindo ao Banco SENAI");
            System.out.println("Login...: ");
            String login = in.next();
            
            if(gerentes.indexOf(login) == -1){
                System.out.println("Login inválido!");
                continue;
            }

            System.out.println("Password: ");
            String pswd = in.next();

            if(!gerentes.get(gerentes.indexOf(login)).getPassword().equals(pswd)){
                System.out.println("Senha inválida!");
                continue;
            }

            System.out.println("");
            
        }while (isLogin != true);
             
        do{
            
            System.out.println("* * * B A N C O   S E N A I * * *");
            System.out.println("=================================");
            System.out.println("");
            System.out.println("1. Cadastro de clientes");
            System.out.println("");
            System.out.println("2. Cadastro de contas");
            System.out.println("");
            System.out.println("Sua opção ou 0 para encerrar: ");
            opc = in.nextInt();
            
            if(opc==0){
                System.out.println("Encerrando Banco SENAI...");
                break;
            }
            
            switch (opc){
                case 1 -> {
                    
                    System.out.println(">>>>> CADASTRO DE CLIENTES <<<<<<");
                    
                    do {
                        
                        Cliente cli = new Cliente();
                        
                        in.nextLine();
                        System.out.println("Nome do clientes ou FIM: ");
                        in.nextLine();
                        String nome = in.nextLine();
                        
                        if(nome.toUpperCase().equals("FIM")){
                            System.out.println("Finalizando cadastro de clientes");
                            break;
                        }
                        
                        cli.setNome(nome);
                        
                        System.out.println("Sobrenome..............: ");
                        cli.setSobrenome(in.nextLine());
                        
                        System.out.println("Tlefone................: ");
                        cli.setTelefone(in.next());
                        
                        cliente.add(cli);
                                
                    }while (true);
                }
                case 2 -> {
                    
                    if(cliente.isEmpty()){
                        System.out.println("Cadastro de clientes VAZIO!");
                        break;
                    }
                    
                    do{
                        
                        ContaBancaria cont = new ContaBancaria();
                        
                        System.out.println(">>>>> CADASTRO DE CONTAS <<<<<<");
                        System.out.println("");
                        System.out.println("Agência ou FIM: ");
                        String agencia = in.next();
                        
                        if(agencia.equalsIgnoreCase("fim")){
                            System.out.println("Encerrando cadastro de contas");
                            break;
                        }
                        
                        cont.setAgencia(agencia);
                        
                        System.out.println("Conta.........: ");
                        cont.setConta(in.next());
                        
                        int n = 1;
                        System.out.println("CLIENTES CADASTRADOS");
                        System.out.println("====================");
                        for(Usuario c: cliente){
                            System.out.println(n++ +". "+ c);
                        }
                        
                        System.out.println("Selecione o cliente");
                        int selecionado = in.nextInt();
                        
                        cont.setTitular(cliente.get(--selecionado));
                        
                        System.out.println("Saldo.........: ");
                        cont.setSaldo(in.nextDouble());
                        
                        conta.add(cont);
                        
                    }while (true);
                }
                
                default -> {
                    System.out.println("Seleção inválida!");
                    continue;
                }
                
            }
            
        }while (true);
        
    }
    
}
