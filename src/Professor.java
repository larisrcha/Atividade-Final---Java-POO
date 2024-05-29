public class Professor extends Pessoa {

    // atributos
    private String centro;

    // Construtor
    public Professor(String cpf, String nome, int idade, String centro) {
        super(cpf, nome, idade);
        this.centro = centro;
    }

    // Getter's
    public String getCentro() {
        return centro;
    }
    // Setter's
    public void setCentro(String centro) {
        this.centro = centro;
    }

    public void darAula() {
        System.out.println("Professor " + getNome() + " está ministrando aula.");
    }
}
