package classes;

public interface MeioTransporte {
    boolean verificaOcupacao(String assento);
    int quantidadeLivre();
    void mostrarAssentos();

    Assento getAssento(String assento, String classe);

    Assento getAssento(String assentos);
}
