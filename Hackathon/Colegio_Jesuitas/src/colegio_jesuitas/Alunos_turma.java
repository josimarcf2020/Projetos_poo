
package colegio_jesuitas;

public class Alunos_turma {
    
    private Turma idTurma;
    private Aluno idAluno;

    public Alunos_turma() {
    }

    public Alunos_turma(Turma idTurma, Aluno idAluno) {
        this.idTurma = idTurma;
        this.idAluno = idAluno;
    }

    public Turma getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(Turma idTurma) {
        this.idTurma = idTurma;
    }

    public Aluno getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Aluno idAluno) {
        this.idAluno = idAluno;
    }
    
    public void alocarAluno(Aluno idAluno, Turma idTurma){
        setIdTurma(idTurma);
        setIdAluno(idAluno);
    }
    
}
