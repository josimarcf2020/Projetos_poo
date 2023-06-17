/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sap_pratica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author josimar & Junior
 */
public class SAP_Pratica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        ArrayList<Admin> admin = new ArrayList();
        ArrayList<Cliente> clientes = new ArrayList();
        ArrayList<Produto> produtos = new ArrayList();
        
        Admin adm = new Admin();
        Cliente cli = new Cliente();
        
        String prod, xLog, xSenha;
        double val;
        
        adm.setNomeAdmin("admin");
        adm.setLogin("admin1234");
        adm.setSenha("@1234");
        adm.setEmail("admin@admin.br");
        adm.setDataRegistro(formato.parse("16/06/2023"));
        
        admin.add(adm);
        
        cli.setNomeCliente("Cliente 1");
        cli.setLogin("cliente01");
        cli.setSenha("cli1234");
        cli.setEmail("cliente01@loja.br");
        cli.setDataRegistro(formato.parse("17/06/2023"));
        cli.setEndereco("Rua 100, 235");
        
        clientes.add(cli);
                
        Scanner input = new Scanner(System.in);
        
        do{
         
            System.out.println("");
            System.out.println("==== M A R I S A   B E A C H ====");
            System.out.println("");
            System.out.println("MENU INICIAL");
            System.out.println("");
            System.out.println("1. Administrador");
            System.out.println("");
            System.out.println("2. Cliente");
            System.out.println("");
            System.out.print("Informe sua opção ou ZERO para sair:");
            String opc = input.next();
            
            if(opc.equals("0")){
                System.out.println("Encerrando sistema");
                break;
            }
            
            switch(opc){
                
                case "1" -> {
                    
                    System.out.println("");
                    System.out.println("==== M A R I S A   B E A C H ====");
                    System.out.println("");
                    System.out.println("LOGIN DO ADMINISTRADOR");
                    System.out.println("");
                    System.out.println("Login: ");
                    xLog = input.next();
                    System.out.println("");
                    System.out.println("Senha: ");
                    xSenha = input.next();
                        
                    if(!xSenha.equals(admin.get(0).getSenha()) || 
                       !xLog.equals(admin.get(0).getLogin())){
                        System.out.println("Login ou senha inválido!");
                        break;
                    }
                    
                    do{
                               
                        System.out.println("");
                        System.out.println("MENU ADMINISTRADOR");
                        System.out.println("");
                        System.out.println("1. Cadastrar Produtos");
                        System.out.println("");
                        System.out.println("2. Atualizar Cadastro de Produtos");
                        System.out.println("");
                        System.out.print("Informe sua opção ou ZERO para sair: ");
                        opc = input.next();
                        
                        if(opc.equals("0")){
                            System.out.println("Encerrando o menu administrador");
                            break;
                        }
                        
                        switch(opc){
                            case "1" -> {
                                
                                do{
                                    
                                    Produto prd = new Produto();
                                    
                                    System.out.println("CADASTRO DE PRODUTOS");
                                    System.out.println("");
                                    input.nextLine();
                                    System.out.println("Produto:");
                                    prod = input.nextLine();
                                    
                                    if(prod.equals("0")){
                                        System.out.println("Encerrando cadastro de Produtos");
                                        break;
                                    }
                                    
                                    prd.setNome(prod);
                                    
                                    System.out.println("Valor:");
                                    val = input.nextDouble();
                                    
                                    prd.setValor(val);
                                    
                                    produtos.add(prd);
                                    
                                }while(true);
                                
                                break;
                                
                            }
                            case "2" -> {
                                
                                if(produtos.isEmpty()){
                                    System.out.println("Cadastro de produtos VAZIO, cadastre produtos!");
                                    break;
                                }
                                
                                String nm;
                                double vl;
                                int it;
                                
                                String continua = "";
                                
                                do{
                                
                                    Produto prd = new Produto();
                                    
                                    System.out.println("LISTA DE PRODUTOS CADASTRADOS");
                                    System.out.println("-------------------------------");
                                    int item = 1;
                                    for(Produto p:produtos){
                                        System.out.printf("%d %s\n", item++, p.getNome());
                                    }
                                    
                                    System.out.println("");
                                    System.out.println("Informe o item a atualizar:");
                                    it = input.nextInt();
                                    
                                    input.nextLine();
                                    System.out.println("Produto: ");
                                    nm = input.nextLine();
                                    System.out.println("Valor..: ");
                                    vl = input.nextDouble();
                                    
                                    prd.setNome(nm);
                                    prd.setValor(vl);
                                    
                                    produtos.get(it-1).setNome(nm);
                                    produtos.get(it-1).setValor(vl);
                                    
                                    System.out.println("Atualizar mais produtos? S/N");
                                    continua = input.next().toUpperCase();
                                    
                                    if(continua.equals("N")){
                                        break;
                                    }
                                    
                                }while(true);
                                
                                break;
                                                           
                            }
                            default -> System.out.println("Opção inválida!!!");
                        }
                        
                    }while(true);
                    
                    break;
                    
                }
                case "2" -> {
                    
                    if(produtos.isEmpty()){
                        System.out.println("Cadastro de produtos VAZIO. Contate o Administrador do site");
                        break;
                    }

                    System.out.println("");
                    System.out.println("==== M A R I S A   B E A C H ====");
                    System.out.println("");
                    System.out.println("LOGIN DO CLIENTE");
                    System.out.println("");
                    System.out.println("Login: ");
                    xLog = input.next();
                    System.out.println("");
                    System.out.println("Senha: ");
                    xSenha = input.next();
                        
                    if(!xSenha.equals(clientes.get(0).getSenha()) || 
                       !xLog.equals(clientes.get(0).getLogin())){
                       System.out.println("Login ou senha inválido!");
                       break;
                    }
                    
                    do{
                        
                        System.out.println("MENU CLIENTE");
                        System.out.println("");
                        System.out.println("1. Visualizar Produtos");
                        System.out.println("");
                        System.out.println("2. Realizar Pedidos");
                        System.out.println("");
                        System.out.print("Informe sua opção ou ZERO para sair: ");
                        opc = input.next();
                        
                        if(opc.equals("0")){
                            System.out.println("Encerrando o menu cliente");
                            break;
                        }
                        
                        switch(opc){
                            
                            case "1" -> {
                                
                                Produto prd = new Produto();
                                    
                                System.out.println("");
                                System.out.println("==== M A R I S A   B E A C H ====");
                                System.out.println("");
                                System.out.println("LISTA DE PRODUTOS");
                                System.out.println("-------------------------------");
                                int item = 1;
                                for(Produto p:produtos){
                                    System.out.printf("%d \t%s \tR$ %.2f\n", item++, p.getNome(), p.getValor());
                                }
                                
                                break;
                            }
                            case "2" -> {
                                
                                ArrayList<Pedido> pedidos = new ArrayList();
                                
                                System.out.println("");
                                System.out.println("==== M A R I S A   B E A C H ====");
                                System.out.println("");
                                System.out.println("CADASTRO DE PEDIDOS");
                                System.out.println("-------------------");
                                System.out.println("");
                                System.out.println("LISTA DE PRODUTOS");
                                System.out.println("---------------------------------------------------------");
                                int item = 1;
                                System.out.printf("ITEM \tPRODUTO \tVALOR\n");
                                System.out.println("---------------------------------------------------------");        
                                for(Produto p:produtos){
                                    System.out.printf("%d \t%s \tR$ %.2f\n", item++, p.getNome(), p.getValor());
                                }
                                
                                System.out.println("Informe o item: ");
                                int itm = input.nextInt()-1;
                                
                                if(itm > produtos.size() || itm < 0){
                                    System.out.println("Item não consta na lista");
                                    continue;
                                }
                                
                                int numPed = pedidos.get(pedidos.size()-1).getNumPedido() + 1;
                                
                                break;
                            }
                            default -> System.out.println("Opção inválida!!!");
                        }
                        
                    }while(true);
                    
                    break;
                    
                }
                default -> System.out.println("Opção inválida!!!");
                            
            }
            
        }while(true);
        
    }
    
}
