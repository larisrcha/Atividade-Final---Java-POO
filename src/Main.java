public class Main {
    public static void main(String[] args) {

        // 3 objetos de disciplina
        Disciplina disciplina1 = new Disciplina("INF101", "Introdução à Programação", 1);
        Disciplina disciplina2 = new Disciplina("MAT202", "Cálculo II", 2);
        Disciplina disciplina3 = new Disciplina("FIS103", "Física Geral I", 3);

        // 3 objetos de aluno (2 regulares e 1 bolsista)
        Aluno regular1 = new Regular("123.456.789-00", "João Silva", 27, 123456);
        Aluno regular2 = new Regular("987.654.321-00", "Maria Gomes", 22, 654321);
        Aluno bolsista = new Bolsista("000.111.222-33", "Pedro Oliveira", 19, 789012);

        // 1 objeto Professor
        Professor professor = new Professor("555.444.333-22", "Ana Souza", 42, "Departamento de Informática");

        // 2 objetos visitante
        Visitante visitante1 = new Visitante("111.222.333-44", "Carla Mendes", 20);
        Visitante visitante2 = new Visitante("222.333.444-55", "Roberto Santos", 22);

        // 3 objetos turma
        Turma turma1 = new Turma(101, disciplina1, professor);
        turma1.adicionarAluno(regular1);
        turma1.adicionarAluno(regular2);
        turma1.adicionarAluno(bolsista);

        Turma turma2 = new Turma(102, disciplina2, professor);
        turma2.adicionarAluno(regular2);
        turma2.adicionarAluno(bolsista);

        Turma turma3 = new Turma(103, disciplina3, professor);
        turma3.adicionarAluno(regular1);
        turma3.adicionarAluno(bolsista);

        // Impressão
        System.out.println();
        turma1.listarAlunos();
        System.out.println();
        turma2.listarAlunos();
        System.out.println();
        turma3.listarAlunos();
        System.out.println();
    }
}


