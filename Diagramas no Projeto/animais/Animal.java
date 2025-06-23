public class Animal {
    protected String nome;
    protected int idade;

    public void emitirSom() {
        System.out.println("Animal fazendo som");
    }
}

public class Vaca extends Animal {
    public void produzirLeite() {
        System.out.println("A vaca produziu leite!");
    }
}
