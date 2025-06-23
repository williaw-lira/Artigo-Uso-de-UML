public class Fazendeiro {
    private String nome;
    private int idade;

    public Fazendeiro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void plantar() {
        System.out.println(nome + " está plantando...");
    }

    public void colher() {
        System.out.println(nome + " está colhendo...");
    }
}
