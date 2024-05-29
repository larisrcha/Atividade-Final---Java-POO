import java.time.LocalDate;
public abstract class Pessoa {

    // Atributos privados
    private String cpf;
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String cpf, String nome, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    // Getters
    public String getCpf() { return this.cpf; }
    public String getNome() {
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }
    // Setters
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para fazer aniversario
    public void incrementarIdade() {
        idade++;
    }

    public void fazerAniversario() {
        incrementarIdade();
        System.out.println("Parabéns " + nome + "! Você completou " + idade + " anos!");
    }
}