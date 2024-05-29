public abstract class Aluno extends Pessoa {

    // Atributo
    private int matricula;

    // Construtor
    public Aluno(String cpf, String nome, int idade, int matricula) {
        super(cpf, nome, idade);
        this.matricula = matricula;
    }

    // Getters
    public int getMatricula() {
        return matricula;
    }

    // Setters
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    // Método pagarMensalidade
    public void pagarMensalidade() {
        System.out.println("Aluno " + getNome() + " pagou a mensalidade.");
    }
}
