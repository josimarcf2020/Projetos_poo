/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sap_pratica;

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
    public static void main(String[] args) {
        
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
                    
                    ArrayList<Produto> produtos = new ArrayList();
                    String prod;
                    double val;
                    
                    do{
                        
                        System.out.println("");
                        System.out.println("==== M A R I S A   B E A C H ====");
                        System.out.println("");
                        System.out.println("MENU ADMINISTRADOR");
                        System.out.println("");
                        System.out.println("1. Cadastrar Produtos");
                        System.out.println("");
                        System.out.println("2. Atualizar Cadastro de Produtos");
                        System.out.println("");
                        System.out.print("Informe sua opção ou ZERO para sair:");
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
                                    continua = input.next();
                                    
                                    if(continua.equals("N")){
                                        break;
                                    }
                                    
                                }while(true);
                                                           
                            }
                            default -> System.out.println("Opção inválida!!!");
                        }
                        
                    }while(true);
                    
                }
                case "2" -> {
                    
                    do{
                        
                        System.out.println("");
                        System.out.println("==== M A R I S A   B E A C H ====");
                        System.out.println("");
                        System.out.println("MENU CLIENTE");
                        System.out.println("");
                        System.out.println("1. Visualizar Produtos");
                        System.out.println("");
                        System.out.println("2. Realizar Pedidos");
                        System.out.println("");
                        System.out.print("Informe sua opção ou ZERO para sair:");
                        opc = input.next();
                        
                        if(opc.equals("0")){
                            System.out.println("Encerrando o menu cliente");
                            break;
                        }
                        
                        switch(opc){
                            case "1" -> {
                            }
                            case "2" -> {
                            }
                            default -> System.out.println("Opção inválida!!!");
                        }
                        
                    }while(true);
                }
                default -> System.out.println("Opção inválida!!!");
                            
            }
            
        }while(true);
        
    }
    
}
