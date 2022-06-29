package classes;

public interface MeioTransporte {
    boolean verificaOcupacao(String assento);
    int quantidadeLivre();
    void mostrarAssentos();

    Assento getAssento(String assentos);
}
