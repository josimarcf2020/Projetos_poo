
package colegio_jesuitas;

import java.util.ArrayList;
import java.util.Scanner;

public class Colegio_Jesuitas {

    public static void main(String[] args) {
        
        ArrayList<Aluno> aluno = new ArrayList<>();
        ArrayList<Turma> turma = new ArrayList<>();
        ArrayList<Alunos_turma> alunos_turma = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        
        do{
        
            System.out.println("* * * * * *   E S C O L A   J E S U Í T A S   * * * * * * ");
            System.out.println("");
            System.out.println("M E N U   P R I N C I P A L");
            System.out.println("");        
            System.out.println("Selecione a operaçãodesejada");
            System.out.println("");
            System.out.println("1. Cadastro de Alunoss");
            System.out.println("2. Cadastro de Turmas");
            System.out.println("3. Cadastro de Notas");
            System.out.println("4. Emitir Relatório");
            System.out.println("0. Sair do Sistema");
            System.out.println("");
            System.out.print("Sua opção: ");
            String opc = input.next();
            
            if(opc.equals("0")){
                System.out.println("Finalizando o sistema... Bye!");
                break;
            }
            
            switch (opc){
                case "1":
                    
                    System.out.println("# # # #   C A D A S T R O   D E   A L U N O S   # # # # ");
                    
                    if(turma.size() == 0){
                        System.out.println("");
                        System.out.println("Cadastro de turmas vazio! Cadastre turmas...");
                        continue;
                    }
                    
                    do{
                        
                        Aluno al = new Aluno();
                                   
                        System.out.println("");
                        System.out.println("Matricula ou [000} para sair: ");
                        String mat = input.next();

                        if(mat.equals("000")){
                            System.out.println("Saindo do Cadastro de Alunos:");
                            break;
                        }
                      
                        boolean exist = false;
                        for(Aluno a: aluno){
                            if(a.getIdAluno().equals(mat)){
                                System.out.println("Matricula já em uso!!");
                                exist = true;
                                break;
                            }
                        }
                                              
                        if(!exist){                          
                                                        
                            al.setIdAluno(mat);

                            input.nextLine();
                            System.out.println("Nome completo...............:");
                            al.setNome(input.nextLine());

                            aluno.add(al);

                            System.out.println("Aluno cadastrado!");
                            System.out.println("");
                            
                        }                      
                        
                        Turma t = new Turma();
                        
                        System.out.println("TURMAS DISPONIVEIS");
                        int seq = 1;
                        for(Turma trm: turma){
                            System.out.printf("%d. %s %s", seq++, trm.getIdTurma(), trm.getNomeTurma());
                        }
                        System.out.println("");
                        System.out.println("Informe o numero da turma: ");
                        int num = input.nextInt();
                                              
                        t.setIdAluno(mat);
                        a_t.setIdTurma(idTurma);
                        
                    }while(true);
                
                    break;
                case "2":
                    
                    System.out.println("# # # #   C A D A S T R O   D E   T U R M A S   #1 # # # ");
                    
                    do{
                        
                        Turma t = new Turma();
                        
                        System.out.println("");
                        System.out.println("Id. Turma ou [000} para sair: ");
                        String tur = input.next();

                        if(tur.equals("000")){
                            System.out.println("Saindo do Cadastro de Turmas:");
                            break;
                        } 
                        
                        boolean exist = false;
                        for(Turma trm: turma){
                            if(trm.getIdTurma().equals(tur)){
                                System.out.println("Turma já existe!!");
                                exist = true;
                                break;
                            }
                        }
                                              
                        if(!exist){                          
                                                   
                            t.setIdTurma(tur);

                            input.nextLine();
                            System.out.println("Descrição da Turma..........: ");
                            t.setNomeTurma(input.nextLine());

                            turma.add(t);

                            System.out.println("Turma cadastrada!");
                            System.out.println("");
                        }
                        
                    }while(true);
                    
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Selecione uma operação válida!");
                    continue;
            }
            
        }while (true);
        
    }
    
}
