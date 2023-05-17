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
        //var conta2 = new ContaBancaria();
        
        // Atribuindo valores aos atributos do objeto 
        conta1.agencia = "0001";
        conta1.conta = "123654";
        conta1.titular = "Joaquim";
        conta1.saldo = 1.99;
        
        System.out.println("agencia:" + conta1.agencia);
        System.out.println("Conta:" + conta1.conta);
        System.out.println("Titular:" + conta1.titular);
        System.out.println("Saldo:" + conta1.saldo);
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("BEM VINDO AO BANCO DO BRASIL");
        System.out.println("CADASTROO DE CONTAS");
        System.out.print("\n Digite a agência:");
        conta1.agencia = in.next();
        System.out.print("\n Digite a conta:");
        conta1.conta = in.next();
        System.out.print("\n Digite a Titular:");
        conta1.titular = in.next();
        System.out.print("\n Digite a Saldo:");
        conta1.saldo = in.nextDouble();
        
        System.out.print("\n Digite a agência:" + conta1.agencia);
        System.out.print("\n Digite a conta:" + conta1.conta);
        System.out.print("\n Digite a Titular:" + conta1.titular);
        System.out.print("\n Digite a Saldo:" + conta1.saldo);
        
    }
    
}
