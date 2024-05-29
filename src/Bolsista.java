public class Bolsista extends Aluno {
    public Bolsista(String cpf, String nome, int idade, int matricula) {
        super(cpf, nome, idade, matricula);
    }

    // Métodos
    @Override
    public void pagarMensalidade() {
        System.out.println("Bolsista " + getNome() + " pagou a mensalidade com desconto.");
    }
}
