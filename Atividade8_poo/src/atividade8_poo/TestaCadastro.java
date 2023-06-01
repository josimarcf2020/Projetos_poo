
package atividade8_poo;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaCadastro {

    public static void main(String[] args) {
    
        ArrayList<Cliente> cliente = new ArrayList<>();
        ArrayList<Funcionario> funcionario = new ArrayList<>();
        ArrayList<Gerente> gerente = new ArrayList<>();
        
        Scanner in = new Scanner(System.in);
        
        do{
            
            System.out.println("* * * * C A D A S T R O   D E   P E S S O A S * * * *");
            System.out.println("");
            System.out.println("1. Clientes");
            System.out.println("");
            System.out.println("2. Funcionarios");
            System.out.println("");
            System.out.println("3. Gerentes");
            System.out.println("");
            System.out.println("4. Relatórios");
            System.out.println("");
            System.out.println("0. Sair do Cadastro de Pessoas");
            System.out.println("");
            System.out.print("Sua opção: ");
            String opc = in.next();
            
            if(opc.equals("0")){
                System.out.println("Saindo do Cadastro... BYE!!!");
                break;
            }
            
            switch (opc){
                case "1" -> {
                    do{
                    
                        Cliente cli = new Cliente();
                    
                        int num;
                        if(cliente.isEmpty()){
                            num = 1;
                        }else{
                            num = cliente.get(cliente.lastIndexOf(cliente)).getCodigo() + 1;
                        }
                    
                        System.out.println("* * * * C A D A S T R O   D E   C L I E N T E S * * * *");
                        System.out.println("=======================================================");
                        System.out.println("");
                        System.out.printf("Código do Cliente.....: %d\n", num);
                        System.out.println("");
                        in.nextLine();
                        System.out.println("Nome ou ENTER para sair:");
                        System.out.println("");
                   
                        cli.setCodigo(num);
                        cli.setNome(in.nextLine());
                    
                        if(cli.getNome().isEmpty()){
                            System.out.println("Finalizando cadastro de alunos...");
                            break;
                        }
                        
                        System.out.println("Data de Nascimento.....: ");
                        
                        Data data = new Data();
                        
                        System.out.print("Dia: "); 
                        data.setDia(in.nextInt());
                        
                        System.out.print("Mês: ");
                        data.setMes(in.nextInt());
                        
                        System.out.print("Ano: ");
                        data.setAno(in.nextInt());
                                
                        cli.setNascimento(data);
                        System.out.print("");
                        
                        cliente.add(cli);
                        
                    }while (true);
                }
                case "2" -> {
                    do{
                        
                        Funcionario func = new Funcionario();
                        
                        in.nextLine();
                        System.out.println("* * * * C A D A S T R O   D E   F U N C I O N A R I O S * * * *");
                        System.out.println("================================================================");
                        System.out.println("");
                        in.nextLine();
                        System.out.println("Nome ou ENTER para sair: ");
                        func.setNome(in.nextLine());
                        
                        if(func.getNome().isEmpty()){
                            System.out.println("Finalizando cadastro de Funcionarios");
                            break;
                        }
                        
                        System.out.print("Data de Nascimento.....: ");
                        
                        Data data = new Data();
                        
                        data.setDia(in.nextInt());
                        System.out.print("/");
                        data.setMes(in.nextInt());
                        System.out.print("/");
                        data.setAno(in.nextInt());
                        
                        func.setNascimento(data);
                        
                        System.out.print("Salário:");
                        func.setSalario(in.nextFloat());
                        
                        funcionario.add(func);
                        
                    }while(true);
                }
                case "3" -> {
                    do{
                        
                        Gerente ger = new Gerente();
                        
                        in.nextLine();
                        System.out.println("* * * * C A D A S T R O   D E   G E R E N T E S * * * *");
                        System.out.println("=======================================================");
                        System.out.println("");
                        in.nextLine();
                        System.out.println("Nome ou ENTER para sair: ");
                        ger.setNome(in.nextLine());
                                             
                        if(ger.getNome().isEmpty()){
                            System.out.println("Finalizando cadastro de Gerentes");
                            break;
                        }
                        
                        System.out.print("Data de Nascimento.....: ");
                        
                        Data data = new Data();
                        
                        data.setDia(in.nextInt());
                        System.out.print("/");
                        data.setMes(in.nextInt());
                        System.out.print("/");
                        data.setAno(in.nextInt());
                        
                        ger.setNascimento(data);
                        
                        in.nextLine();
                        System.out.println("Área de atuação: ");
                        ger.setArea(in.nextLine());
                        
                        gerente.add(ger);
                        
                    }while(true);
                }
                case "4" -> {
                    System.out.println("* * * * R E L A T Ó R I O S * * * *");
                    System.out.println("");
                    System.out.println("1. Clientes");
                    System.out.println("");
                    System.out.println("2. Funcionarios");
                    System.out.println("");
                    System.out.println("3. Gerentes");
                    System.out.println("");
                    System.out.println("0. Sair do Cadastro de Pessoas");
                    System.out.println("");
                    System.out.print("Sua opção: ");
                    opc = in.next();

                    if(opc.equals("0")){
                        System.out.println("Finalizando Relatórios... BYE!!!");
                        break;
                    }

                    switch (opc){
                        case "1" -> {
                            
                            System.out.println("");
                            System.out.println("* * * * C A D A S T R O   D E   P E S S O A S * * * *");
                            System.out.println("");
                            System.out.println("> > > > R E L A T Ó R I O   D E   C L I E N T E S > > > >");
                            System.out.println("");
                            
                            int ord = 1;
                            for(Cliente c : cliente){
                                Cliente cli = new Cliente();
                                System.out.printf("%d - %d %s", ord++, cli.getCodigo(), cli.getNome());
                            }
                            
                        }
                        case "2" -> {
                            
                            System.out.println("");
                            System.out.println("* * * * C A D A S T R O   D E   P E S S O A S * * * *");
                            System.out.println("");
                            System.out.println("> > > > R E L A T Ó R I O   D E   F U N C I O N A R I O S > > > >");
                            System.out.println("");
                            
                            int ord = 1;
                            for(Funcionario f : funcionario){
                                Funcionario fun = new Funcionario();
                                System.out.printf("%d - %s", ord++, fun.getNome());
                            }
                        }
                        case "3" -> {
                            
                            System.out.println("");
                            System.out.println("* * * * C A D A S T R O   D E   P E S S O A S * * * *");
                            System.out.println("");
                            System.out.println("> > > > R E L A T Ó R I O   D E   G E R E N T E S > > > >");
                            System.out.println("");
                            
                            int ord = 1;
                            for(Gerente g : gerente){
                                Gerente ger = new Gerente();
                                System.out.printf("%d - %s %s", ord++, g.getNome(), g.getArea());
                            }
                        }
                        
                        default -> {
                            System.out.println("Opção INVÁLIDA!!!");
                            continue;
                        }
                    }   
                }
            }
        }while (true);
    }
}
