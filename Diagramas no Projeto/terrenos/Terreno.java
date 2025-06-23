public class Terreno {
    private int tamanho;
    private String tipoSolo;

    public void prepararSolo() {
        System.out.println("Solo preparado.");
    }
}

public class Plantado extends Terreno {
    public void plantar() {
        System.out.println("Semente plantada.");
    }
}
