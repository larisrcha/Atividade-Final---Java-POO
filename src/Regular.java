public class Regular extends Aluno {
    public Regular(String cpf, String nome, int idade, int matricula) {
        super(cpf, nome, idade, matricula);
    }

    // Métodos
    @Override
    public void pagarMensalidade() {
        System.out.println("Aluno regular " + getNome() + " pagou a mensalidade.");
    }
}
