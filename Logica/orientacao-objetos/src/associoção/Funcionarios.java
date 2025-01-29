package associoção;

public class Funcionarios {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionarios(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionarios { " +
                "nome='" + nome + '\'' +
                '}';
    }
}
