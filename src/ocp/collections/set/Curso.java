package ocp.collections.set;

public final class Curso {

    private String nome;

    public Curso(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
