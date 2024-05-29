import java.util.ArrayList;

public class Turma {

    // Atributos
    private int codigo;
    private Disciplina disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    // Construtor
    public Turma(int codigo, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<Aluno>();
    }

    // Getters
    public int getCodigo() { return codigo; }
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public Professor getProfessor() {
        return professor;
    }
    // Setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    // Métodos para alunos
    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
    public void removerAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public void listarAlunos() {
        System.out.println("Informações da Turma " + codigo + ":");
        System.out.println("- Disciplina: " + disciplina.getNome() + " (" + disciplina.getCodigo() + ")");
        System.out.println("- Professor(a): " + professor.getNome() + " (" + professor.getCentro() + ")");
        System.out.println("- Alunos matriculados:");
        for (Aluno aluno : alunos) {
            System.out.println("    - " + aluno.getNome() + " (" + aluno.getMatricula() + ")");
        }
    }

}


