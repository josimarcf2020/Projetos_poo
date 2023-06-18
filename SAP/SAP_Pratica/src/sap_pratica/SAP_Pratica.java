/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sap_pratica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
        ArrayList<Pedido> pedidos = new ArrayList();
        ArrayList<CartaoCredito> ccard = new ArrayList();
                                             
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
                        System.out.println("3. Consultar Pedidos");
                        System.out.println("");
                        System.out.println("4. Finalizar Pedido");
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
                                
                                Pedido ped = new Pedido();
                                
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
                                int itm = input.nextInt();
                                
                                if(itm-1 > produtos.size() || itm-1 < 0){
                                    System.out.println("Item não consta na lista");
                                    continue;
                                }
                                
                                if(pedidos.isEmpty()){
                                    ped.setNumPedido(1);
                                    ped.setStatus(1);
                                }else{
                                    if(pedidos.get(pedidos.size()-1).getStatus()==1){
                                        ped.setNumPedido(pedidos.get(pedidos.size()-1).getNumPedido());                               
                                    }else{
                                        ped.setNumPedido(pedidos.get(pedidos.size()-1).getNumPedido() + 1);
                                            }
                                    ped.setStatus(1);
                                }
                                
                                ped.setDataCriacao(formato.getCalendar().getTime());
                                ped.setProduto(produtos.get(itm-1).getNome());
                                ped.setValor(produtos.get(itm-1).getValor());
                                
                                pedidos.add(ped);
                                
                                System.out.println("Pedido Realizado com sucesso!!!");
                                
                                break;
                            }
                            case "3" -> {
                                
                                Pedido ped = new Pedido();
                                    
                                System.out.println("");
                                System.out.println("==== M A R I S A   B E A C H ====");
                                System.out.println("");
                                System.out.println("LISTA DE PEDIDOS");
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.printf("ITEM \tPEDIDO \tPRODUTO \t\tVALOR\n");
                                System.out.println("--------------------------------------------------------------------------------");
                                int item = 1;
                                for(Pedido p: pedidos){
                                    System.out.printf("%d \t%d \t%s \tR$ %.2f\n", item++, p.getNumPedido(), p.getProduto(), p.getValor());
                                }
                                System.out.println("--------------------------------------------------------------------------------");
                                
                                break;
                       
                            }
                            case "4" -> {
                    
                                Pedido ped = new Pedido();
                                    
                                System.out.println("");
                                System.out.println("==== M A R I S A   B E A C H ====");
                                System.out.println("");
                                System.out.println("LISTA DE PEDIDOS");
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.printf("ITEM \tPEDIDO \tPRODUTO \t\tVALOR\n");
                                System.out.println("--------------------------------------------------------------------------------");
                                int item = 1;
                                for(Pedido p: pedidos){
                                    System.out.printf("%d \t%d \t%s \tR$ %.2f\n", item++, p.getNumPedido(), p.getProduto(), p.getValor());
                                }
                                System.out.println("--------------------------------------------------------------------------------"); 
                                
                                System.out.println("Infome o pedido a ser Encerrado: ");
                                int pd = input.nextInt();
                                
                                if(pd > pedidos.get(pedidos.size()-1).getNumPedido() || pd < 1){
                                    System.out.println("Numero de pedido inválido!");
                                    break;
                                }else{
                                    if(pedidos.get(pd).getStatus() != 1){
                                        System.out.println("Pedido já encerrado!!!");
                                        break;
                                    }
                                }
                                
                                double total = 0;
                                for(Pedido p: pedidos){
                                    if(p.getNumPedido() == pd){
                                        total += p.getValor();
                                    }
                                }
                                
                                System.out.printf("Valor TOTAL do Pedido %s: R$ %5.2f\n", pedidos.get(pd).getNumPedido(), total);
                                System.out.println("");
                                System.out.println("Forma de PAGAMENTO: 1 - PIX ou 2 - Cartão de Crédito (2x)");
                                int fPag = input.nextInt();
                                
                                switch(fPag){
                                    case 1 -> {
                                        System.out.println("Gerar pagamento PIX para a chave 123.456.789-00");
                                        pedidos.get(pd).setStatus(2);
                                        break;
                                    }
                                    case 2 -> {
                                        
                                        CartaoCredito ccred = new CartaoCredito();
                                        
                                        System.out.println("Informe os dados do Cartão de Crédito: ");
                                        String cCard = input.next();
                                        
                                        boolean existe = false;
                                        for(CartaoCredito c: ccard){
                                            if(cCard.equals(c.getNumero())){
                                                System.out.println("Cartão ja CADASTRADO");
                                                existe = true;
                                                break;
                                            }
                                        }
                                        
                                        if(!existe){
                                            System.out.println("CADASTRAR NOVO CARTÃO DE CRÉDITO");
                                            System.out.println("");
                                            System.out.println("Numero do Cartão: " + cCard);
                                            ccred.setNumero(cCard);
                                            System.out.println("");
                                            System.out.println("Nome do Titular.: ");
                                            ccred.setNumero(input.next());
                                            System.out.println("");
                                            System.out.println("Data de Validade: ");
                                            ccred.setDtValidade(input.next());
                                            System.out.println("");
                                            System.out.println("Cod. Segurança..: ");
                                            ccred.setCcv(input.next());
                                            
                                            ccard.add(ccred);
                                        }
                                        
                                        break;
                                    }
                                    default -> {
                                        System.out.println("Forma de pagamento INEXISTENTE!");
                                    }
                                }                                
                    
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
